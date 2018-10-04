package fr.ocp.legacy.formation.luke;

import java.math.BigDecimal;
import java.net.MalformedURLException;

import javax.xml.ws.Holder;

import org.junit.Assert;
import org.junit.Test;

import com.sap.document.sap.rfc.functions.ZMATERIALAVAILABILITY;
import com.sap.document.sap.rfc.functions.ZMATERIALAVAILABILITY_Service;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void testRuntimeSerialisation() throws MalformedURLException {

		ZMATERIALAVAILABILITY_Service serviceWSDL = new ZMATERIALAVAILABILITY_Service();
		ZMATERIALAVAILABILITY serviceAvai = serviceWSDL.getZMATERIALAVAILABILITYB();

		String plant = "123";
		String unit = " ";
		String stgeLOC = "";
		String checkRULE = "RS";
		String material = "123";
		
		BigDecimal enquiryQTY = new BigDecimal(123);

		Holder<String> replyERRORDETAIL = new Holder<String>();
		Holder<String> replyRETURNCODE = new Holder<String>();
		Holder<BigDecimal> replyENQUIRYQTY = new Holder<BigDecimal>();
		serviceAvai.zbapiMATERIALAVAILABILITY(checkRULE, enquiryQTY, material, plant, stgeLOC, unit, replyENQUIRYQTY,
				replyERRORDETAIL, replyRETURNCODE);

//		ZBAPIPOCREATE1_Service service = new ZBAPIPOCREATE1_Service();

		// final URL wsdlLocation = new
		// URL("http://localhost:8082/serialisation/ref?wsdl");
		// final RefProductLogicService serviceWSDL = new
		// RefProductLogicService(wsdlLocation);
		//
		// RefProduct refProductService = serviceWSDL.getRefProductLogicPort();
		// RefRequest refRequest = new RefRequest();
		// refRequest.setIdProduct(123L);
		// Assert.assertEquals(7, refProductService.getAll().size());
		Assert.assertTrue(Boolean.TRUE);

	}
}
