package fuhrpark;

public class ElektroPKW extends PKW {
	private Integer anzahlElektroPKW;
	private Integer akkuKapazitaet;
	private Integer ladestand;

	public Integer getAnzahlElektroPKW() {
		return anzahlElektroPKW;
	}

	public void setAnzahlElektroPKW(Integer anzahlElektroPKW) {
		this.anzahlElektroPKW = anzahlElektroPKW;
	}

	public Integer getAkkuKapazitaet() {
		return akkuKapazitaet;
	}

	public void setAkkuKapazitaet(Integer akkuKapazitaet) {
		this.akkuKapazitaet = akkuKapazitaet;
	}

	public Integer getLadestand() {
		return ladestand;
	}

	public void setLadestand(Integer ladestand) {
		this.ladestand = ladestand;
	}

}
