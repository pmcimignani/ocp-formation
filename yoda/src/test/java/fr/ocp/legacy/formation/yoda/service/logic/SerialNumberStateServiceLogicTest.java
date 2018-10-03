package fr.ocp.legacy.formation.yoda.service.logic;

import org.junit.Assert;
import org.junit.Test;

import fr.ocp.legacy.formation.yoda.data.YodaInput;
import fr.ocp.legacy.formation.yoda.data.YodaOutput;
import fr.ocp.legacy.formation.yoda.data.YodaSate;
import fr.ocp.legacy.formation.yoda.service.SerialNumberStateService;

public class SerialNumberStateServiceLogicTest {
	private SerialNumberStateService service = new SerialNumberStateServiceLogic();

	@Test
	public void testGetState_UNKNOW_ProductId_inf_5_Char() {
		YodaInput yodaInput = new YodaInput();
		yodaInput.setIdProduct(new Long(123));
		YodaOutput o = service.getState(yodaInput);
		Assert.assertEquals(YodaSate.UNKNOW, o.getEtat());
	}

	@Test
	public void testGetState_UNKNOW_Lots_Empty() {
		YodaInput yodaInput = new YodaInput();
		yodaInput.setLots("");
		yodaInput.setSerialNumber(1224L);
		yodaInput.setIdProduct(new Long(1234567));
		YodaOutput o = service.getState(yodaInput);
		Assert.assertEquals(YodaSate.UNKNOW, o.getEtat());
	}

	@Test
	public void testGetState_DISPO() {
		YodaInput yodaInput = new YodaInput();
		yodaInput.setLots("Dispo-121");
		yodaInput.setSerialNumber(1224L);
		yodaInput.setIdProduct(new Long(1234567));
		YodaOutput o = service.getState(yodaInput);
		Assert.assertEquals(YodaSate.DISPO, o.getEtat());
	}

	@Test
	public void testGetState_DESTROY() {
		YodaInput yodaInput = new YodaInput();
		yodaInput.setLots("DS-");
		yodaInput.setSerialNumber(1224L);
		yodaInput.setIdProduct(new Long(1234567));
		YodaOutput o = service.getState(yodaInput);
		Assert.assertEquals(YodaSate.DESTROY, o.getEtat());
	}

	@Test
	public void testGetState_DEREF() {
		YodaInput yodaInput = new YodaInput();
		yodaInput.setLots("DF-");
		yodaInput.setSerialNumber(1224L);
		yodaInput.setIdProduct(new Long(1234567));
		YodaOutput o = service.getState(yodaInput);
		Assert.assertEquals(YodaSate.DEREF, o.getEtat());
	}

	@Test
	public void testGetState_Default() {
		YodaInput yodaInput = new YodaInput();
		YodaOutput o = service.getState(yodaInput);
		Assert.assertEquals(YodaSate.UNKNOW, o.getEtat());
	}

}
