package fr.ocp.legacy.formation.yoda.service;

import javax.jws.WebService;

import fr.ocp.legacy.formation.yoda.data.YodaInput;
import fr.ocp.legacy.formation.yoda.data.YodaOutput;

@WebService
public interface SerialNumberStateService {

	public YodaOutput getState(YodaInput yodaInput);
}
