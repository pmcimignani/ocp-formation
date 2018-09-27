package fr.ocp.formations.c3po;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;

import fr.ocp.formation.service.POService;
import fr.ocp.formation.service.PoInput;
import fr.ocp.formation.service.PoOutput;
import fr.ocp.formation.service.logic.POServiceLogicService;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void runtimeTest() throws MalformedURLException {
		URL url =  new URL("http://localhost:8080/r2d2/po?wsdl");
		POServiceLogicService service = new POServiceLogicService(url );
		POService poservice = service.getPOServiceLogicPort();
		PoInput input = new PoInput();
		input.setIdCustomer("IdclientA");
		input.setQuantity(100);
		input.setIdProduct(3032220);
		PoOutput output = poservice.order(input);

		Assert.assertEquals(200, output.getReturnCode());
		Assert.assertEquals(10000.0, output.getPrice(), 0);
	}
}
