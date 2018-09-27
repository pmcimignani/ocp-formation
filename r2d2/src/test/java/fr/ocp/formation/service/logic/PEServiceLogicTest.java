package fr.ocp.formation.service.logic;

import org.junit.Assert;
import org.junit.Test;

import fr.ocp.formation.data.PEInput;
import fr.ocp.formation.data.PEOutput;
import fr.ocp.formation.service.PEService;

public class PEServiceLogicTest {
	PEService peService = new PEServiceLogic();

	@Test
	public void testOrder_CodeRetour200() {
		// Creation de l'input commande
		PEInput input = new PEInput(333, 101);

		// appel au service PE
		PEOutput output = peService.getQuantity(input);

		// output.getReturnCode() --> 0
		// output.getPrice() --> 10000
		Assert.assertEquals(200, output.getReturnCode());

		Assert.assertEquals(50, output.getQuantity());

	}

	@Test
	public void testOrder_CodeRetourMoins1() {
		// Creation de l'input commande
		PEInput input = new PEInput(3030303, 2001);

		// appel au service PE
		PEOutput output = peService.getQuantity(input);

		// output.getReturnCode() --> -1
		Assert.assertEquals(-1, output.getReturnCode());

	}

}
