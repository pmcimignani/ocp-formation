package fr.ocp.legacy.formation.yoda.service.logic;

import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import fr.ocp.formation.serialisation.service.Product;
import fr.ocp.formation.serialisation.service.RefProduct;
import fr.ocp.formation.serialisation.service.RefRequest;
import fr.ocp.formation.serialisation.service.UnknownProductException_Exception;
import fr.ocp.formation.serialisation.service.logic.RefProductLogicService;
import fr.ocp.legacy.formation.yoda.data.YodaInput;
import fr.ocp.legacy.formation.yoda.data.YodaOutput;
import fr.ocp.legacy.formation.yoda.data.YodaSate;
import fr.ocp.legacy.formation.yoda.service.SerialNumberStateService;

@WebService(endpointInterface = "fr.ocp.legacy.formation.yoda.service.SerialNumberStateService")
public class SerialNumberStateServiceLogic implements SerialNumberStateService {
	RefProduct refProductService;

	public SerialNumberStateServiceLogic() {
		try {
			URL wsdlLocation = new URL("http://dev.valuetis.fr/serialisation/ref?wsdl");
			RefProductLogicService serialisationWSDL = new RefProductLogicService(wsdlLocation);
			refProductService = serialisationWSDL.getRefProductLogicPort();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@WebMethod
	public YodaOutput getState(@XmlElement(required = true) YodaInput yodaInput) {
		final YodaOutput yodaOutput = new YodaOutput();
		if (yodaInput.getIdProduct() == null || yodaInput.getIdProduct() < 10000) {
			yodaOutput.setEtat(YodaSate.UNKNOW);
		} else if (yodaInput.getLots() != null && yodaInput.getLots().startsWith("DS-")) {
			yodaOutput.setEtat(YodaSate.DESTROY);
		} else if (yodaInput.getLots() != null && yodaInput.getLots().startsWith("DF-")) {
			yodaOutput.setEtat(YodaSate.DEREF);
		} else if (yodaInput.getIdProduct() != null && (yodaInput.getLots() != null && !yodaInput.getLots().isEmpty())
				&& yodaInput.getSerialNumber() != null) {

			try {

				RefRequest refRequest = new RefRequest();
				refRequest.setIdProduct(yodaInput.getIdProduct());

				refProductService.getRef(refRequest);

				yodaOutput.setEtat(YodaSate.DISPO);

			} catch (UnknownProductException_Exception e) {
				yodaOutput.setEtat(YodaSate.UNKNOW);
			}
		} else {

			yodaOutput.setEtat(YodaSate.UNKNOW);
		}
		return yodaOutput;
	}

}
