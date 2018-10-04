package com.ocp.cxf.rs;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/orders")
public class OrderService {
	final Map<String, OrderProduct> orders;

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
	public Response getOrderById(@PathParam("id") String orderId) {
		// Simuler une creation d'object

		return Response.ok().entity(orders.get(orderId)).build();
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
