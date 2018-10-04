package com.ocp.cxf.rs;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.xml.ws.Holder;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import com.sap.document.sap.rfc.functions.ZMATERIALAVAILABILITY;

@Path("/orders")
public class OrderService {
	String wsdlUrlCall = "http://frddevci.celesiogroup.com:8042/sap/bc/srt/rfc/sap/zmaterial_availability/400/zmaterial_availability/zmaterial_availability_b";

	final Map<String, OrderProduct> orders;
	private String userName = "TOTO";
	private String password = "TITI";
	final ZMATERIALAVAILABILITY service;

	public OrderService() {
		orders = new HashMap<String, OrderProduct>();
		OrderProduct op = new OrderProduct();
		op.setOrderId("1");
		op.setDetails("Details of the product ");
		OrderProduct op2 = new OrderProduct();
		op2.setOrderId("3");
		op2.setDetails("Details of the product ");

		orders.put("1", op);
		orders.put("2", op);

		final JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		jaxWsProxyFactoryBean.setServiceClass(ZMATERIALAVAILABILITY.class);
		jaxWsProxyFactoryBean.setAddress(wsdlUrlCall);
		service = jaxWsProxyFactoryBean.create(ZMATERIALAVAILABILITY.class);
		final Client client = (Client) ClientProxy.getClient(service);
		final HTTPConduit http = (HTTPConduit) ((org.apache.cxf.endpoint.Client) client).getConduit();
		final HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
		http.getAuthorization().setUserName(userName);
		http.getAuthorization().setPassword(password);
		httpClientPolicy.setConnectionTimeout(36000);
		httpClientPolicy.setAllowChunking(false);
		httpClientPolicy.setReceiveTimeout(32000);
		http.setClient(httpClientPolicy);

	}

	@GET
	@Path("/")
	@Produces("application/json")
	public Response getOrders() {
		return Response.ok().entity(orders).build();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Response getProductQuantityByIdFromSAP(@PathParam("id") String orderId) {
		// Simuler une creation d'object

		// URL wsdlUrlFile = new
		// URL("http://frddevci.celesiogroup.com:8042/sap/bc/srt/wsdl/flv_10002A111AD1/bndg_url/sap/bc/srt/rfc/sap/zmaterial_availability/400/zmaterial_availability/zmaterial_availability_b?sap-client=400");

		String checkRULE = "RS";
		BigDecimal enquiryQTY = new BigDecimal(100);
		String material = orderId;
		String plant = "180";
		String stgeLOC = "AFS";
		String unit = " ";
		Holder<BigDecimal> replyENQUIRYQTY = new Holder<BigDecimal>();
		Holder<String> replyERRORDETAIL = new Holder<String>();
		Holder<String> replyRETURNCODE = new Holder<String>();
		service.zbapiMATERIALAVAILABILITY(checkRULE, enquiryQTY, material, plant, stgeLOC, unit, replyENQUIRYQTY,
				replyERRORDETAIL, replyRETURNCODE);

		BigDecimal quantity = replyENQUIRYQTY.value;

		return Response.ok().entity(quantity.toString()).build();
	}

	@POST
	@Path("/enregistrer")
	@Produces("application/json")
	public Response addProduct(OrderProduct orderProduct) {
		// Simuler une creation d'object
		orders.put(orderProduct.getOrderId(), orderProduct);
		return Response.ok().entity(orderProduct).build();
	}

	@DELETE
	@Path("/delete")
	@Produces("application/json")
	public Response delProduct(OrderProduct orderProduct) {
		// Simuler une creation d'object
		orders.remove(orderProduct.getOrderId());
		return Response.ok().entity(orderProduct).build();
	}

	@GET
	@Path("/ben/{sexe}/{age}")
	@Produces("application/json")
	public Response ben(@PathParam("age") String age, @PathParam("sexe") String sexe) {
		// Simuler une creation d'object
		Map map = new HashMap();
		map.put("benji", "is cool, sexe= " + sexe + ", age=" + age);
		return Response.ok().entity(map).build();
	}

	@POST
	@Produces("application/json")
	@Consumes("application/json")
	@Path("/save")
	public Response addOrderProduct(OrderProduct orderProduct) {
		orderProduct.setDetails("SAVED-" + orderProduct.getDetails());
		orderProduct.setTarte("Pomme");
		return Response.ok().entity(orderProduct).build();
	}

	@PUT
	@Produces("application/json")
	@Consumes("application/json")
	@Path("/update")
	public Response update(OrderProduct orderProduct) {
		orderProduct.setDetails("UPDATED-" + orderProduct.getDetails());

		return Response.ok().entity(orderProduct).build();
	}
}