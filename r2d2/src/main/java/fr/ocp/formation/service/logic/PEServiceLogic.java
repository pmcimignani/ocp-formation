package fr.ocp.formation.service.logic;

import javax.jws.WebService;

import fr.ocp.formation.data.PEInput;
import fr.ocp.formation.data.PEOutput;
import fr.ocp.formation.service.PEService;

@WebService(endpointInterface = "fr.ocp.formation.service.PEService")
public class PEServiceLogic implements PEService {

	public PEOutput getQuantity(PEInput input) {
		PEOutput output = new PEOutput();
		if (input.getIdProduct() == 3030303) {
			output.setReturnCode(-1);
		} else {
			output.setReturnCode(200);
			output.setQuantity(input.getQuantity() / 2);
		}
		return output;
	}

}
