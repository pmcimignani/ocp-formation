package fr.ocp.legacy.formation.yoda.data;

public class YodaOutput {
	private YodaSate etat;

	public YodaSate getEtat() {
		return etat;
	}

	public void setEtat(YodaSate etat) {
		this.etat = etat;
	}

	@Override
	public String toString() {
		return "YodaOutput [etat=" + etat + "]";
	}

}
