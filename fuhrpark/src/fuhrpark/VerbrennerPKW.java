package fuhrpark;

public class VerbrennerPKW extends PKW {
	private Integer anzahlVerbrennerPKW;
	private String treibstoff;
	private String fuellstand;

	public Integer getAnzahlVerbrennerPKW() {
		return anzahlVerbrennerPKW;
	}

	public void setAnzahlVerbrennerPKW(Integer anzahlVerbrennerPKW) {
		this.anzahlVerbrennerPKW = anzahlVerbrennerPKW;
	}

	public String getTreibstoff() {
		return treibstoff;
	}

	public void setTreibstoff(String treibstoff) {
		this.treibstoff = treibstoff;
	}

	public String getFuellstand() {
		return fuellstand;
	}

	public void setFuellstand(String fuellstand) {
		this.fuellstand = fuellstand;
	}

}
