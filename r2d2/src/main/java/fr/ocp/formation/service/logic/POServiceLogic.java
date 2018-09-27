package fr.ocp.formation.service.logic;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.ocp.formation.data.POInput;
import fr.ocp.formation.data.POOutput;
import fr.ocp.formation.service.POService;

@WebService(endpointInterface="fr.ocp.formation.service.POService")
public class POServiceLogic implements POService {
	private final static Logger LOG = LoggerFactory.getLogger(POServiceLogic.class);

	public POOutput order(POInput input) {
		LOG.info("Request received :" + input);
		POOutput output = new POOutput();
		int quantity = input.getQuantity();
		if (quantity > 2000) {
			output.setReturnCode(-1);
		} else {
			output.setReturnCode(200);
			output.setPrice(quantity * 100.0);
		}
		return output;
	}

}
