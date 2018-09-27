package fr.ocp.formation.service.logic;

import fr.ocp.formation.data.POInput;
import fr.ocp.formation.data.POOutput;
import fr.ocp.formation.service.POService;

public class POServiceLogic implements POService {

	public POOutput order(POInput input) {
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
