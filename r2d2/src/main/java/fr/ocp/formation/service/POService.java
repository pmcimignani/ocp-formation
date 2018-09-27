package fr.ocp.formation.service;

import javax.jws.WebService;

import fr.ocp.formation.data.POInput;
import fr.ocp.formation.data.POOutput;

/**
 * Service de ommande de produit
 * 
 * @author pmc
 *
 */
@WebService
public interface POService {

	/**
	 * Service de commande de produit
	 * 
	 * @param input
	 * @return @see R2D2Output
	 */
	public POOutput order(POInput input);
}
