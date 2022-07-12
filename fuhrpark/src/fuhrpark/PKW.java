package fuhrpark;

public class PKW extends Fahrzeug {
	private String kfzKennzeichen;
	private Integer anzahlTueren;
	private Integer anzahlMaxInsassen;

	public String getKfzKennzeichen() {
		return kfzKennzeichen;
	}

	public void setKfzKennzeichen(String kfzKennzeichen) {
		this.kfzKennzeichen = kfzKennzeichen;
	}

	public Integer getAnzahlTueren() {
		return anzahlTueren;
	}

	public void setAnzahlTueren(Integer anzahlTueren) {
		this.anzahlTueren = anzahlTueren;
	}

	public Integer getAnzahlMaxInsassen() {
		return anzahlMaxInsassen;
	}

	public void setAnzahlMaxInsassen(Integer anzahlMaxInsassen) {
		this.anzahlMaxInsassen = anzahlMaxInsassen;
	}

}
