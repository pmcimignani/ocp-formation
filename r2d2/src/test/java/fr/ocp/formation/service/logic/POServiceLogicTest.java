package fr.ocp.formation.service.logic;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import fr.ocp.formation.data.POInput;
import fr.ocp.formation.data.POOutput;
import fr.ocp.formation.service.POService;

public class POServiceLogicTest {
	POService poService = new POServiceLogic();

	@Test
	public void testOrder_CodeRetour200() {
		// Creation de l'input commande
		POInput input = new POInput(333, 100, "idclient1");

		// appel au service Po
		POOutput output = poService.order(input);

		// output.getReturnCode() --> 0
		// output.getPrice() --> 10000
		Assert.assertEquals(200, output.getReturnCode());

		Assert.assertEquals(10000.0, output.getPrice(), 0);

	}
	@Test
	public void testOrder_CodeRetourMoins1() {
		// Creation de l'input commande
		POInput input = new POInput(333, 2001, "idclient1");

		// appel au service Po
		POOutput output = poService.order(input);

		// output.getReturnCode() --> -1
		Assert.assertEquals(-1, output.getReturnCode());
		Assert.assertEquals(0.0, output.getPrice(),0);
		

	}

}
