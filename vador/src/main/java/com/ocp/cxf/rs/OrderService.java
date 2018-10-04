package com.ocp.cxf.rs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebParam;
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

	@GET
	@Path("/")
	@Produces("application/json")
	public Response getOrders() {

		OrderProduct op = new OrderProduct();
		op.setOrderId("1");
		op.setDetails("Details of the product ");

		List<OrderProduct> orders = new ArrayList<OrderProduct>();
		orders.add(op);

		return Response.ok().entity(orders).build();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Response getOrderById(@PathParam("id") String orderId) {
		// Simuler une creation d'object
		OrderProduct op = new OrderProduct();
		op.setOrderId(orderId);
		op.setDetails("Details of the product with id  = " + orderId);
		return Response.ok().entity(op).build();
	}

	@GET
	@Path("/ben/{sexe}/{age}")
	@Produces("application/json")
	public Response ben(@PathParam("age") String age, @PathParam("sexe") String sexe) {
		// Simuler une creation d'object
		Map map = new HashMap();
		map.put("benji", "is cool, sexe= "+sexe+", age="+age);
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
