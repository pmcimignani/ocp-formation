package fr.ocp.formation.service;

import javax.jws.WebService;

import fr.ocp.formation.data.PEInput;
import fr.ocp.formation.data.PEOutput;

/**
 * Service de demande de dispo produit
 * 
 * @author pmc
 *
 */
@WebService
public interface PEService {

	/**
	 * Service de de demande de dispo produit
	 * 
	 * @param input
	 * @return @see PEOutput
	 */
	public PEOutput getQuantity(PEInput input);
}
