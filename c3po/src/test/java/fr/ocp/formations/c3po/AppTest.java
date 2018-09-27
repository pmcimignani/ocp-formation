package fr.ocp.formations.c3po;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;

import fr.ocp.formation.service.PEService;
import fr.ocp.formation.service.POService;
import fr.ocp.formation.service.PeInput;
import fr.ocp.formation.service.PeOutput;
import fr.ocp.formation.service.PoInput;
import fr.ocp.formation.service.PoOutput;
import fr.ocp.formation.service.logic.PEServiceLogicService;
import fr.ocp.formation.service.logic.POServiceLogicService;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void runtimeTestPO() throws MalformedURLException {

		URL url = new URL("http://localhost:8080/r2d2/po?wsdl");
		POServiceLogicService service = new POServiceLogicService(url);
		POService poservice = service.getPOServiceLogicPort();
		PoInput input = new PoInput();
		input.setIdCustomer("IdclientA");
		input.setQuantity(100);
		input.setIdProduct(3032220);
		PoOutput output = poservice.order(input);

		Assert.assertEquals(200, output.getReturnCode());
		Assert.assertEquals(10000.0, output.getPrice(), 0);
	}

	@Test
	public void runtimeTestPE() throws MalformedURLException {

		URL url = new URL("http://localhost:8080/r2d2/pe?wsdl");
		PEServiceLogicService service = new PEServiceLogicService(url);
		PEService peService = service.getPEServiceLogicPort();
		PeInput input = new PeInput();
		input.setQuantity(100);
		input.setIdProduct(3032220);
		 PeOutput output = peService.getQuantity(input);

		Assert.assertEquals(200, output.getReturnCode());
		Assert.assertEquals(50, output.getQuantity());
	}
}
