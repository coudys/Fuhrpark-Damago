package fuhrpark;

public class LKW extends Fahrzeug {
	private String kfzKennzeichen;
	private double zulaessigesGesamtgewicht;
	private double ladeVolume;
	private boolean gefahrengut;
	private boolean kuehlung;
	
	public String getKfzKennzeichen() {
		return kfzKennzeichen;
	}
	public void setKfzKennzeichen(String kfzKennzeichen) {
		this.kfzKennzeichen = kfzKennzeichen;
	}
	public double getZulaessigesGesamtgewicht() {
		return zulaessigesGesamtgewicht;
	}
	public void setZulaessigesGesamtgewicht(double zulaessigesGesamtgewicht) {
		this.zulaessigesGesamtgewicht = zulaessigesGesamtgewicht;
	}
	public double getLadeVolume() {
		return ladeVolume;
	}
	public void setLadeVolume(double ladeVolume) {
		this.ladeVolume = ladeVolume;
	}
	public boolean isGefahrengut() {
		return gefahrengut;
	}
	public void setGefahrengut(boolean gefahrengut) {
		this.gefahrengut = gefahrengut;
	}
	public boolean isKuehlung() {
		return kuehlung;
	}
	public void setKuehlung(boolean kuehlung) {
		this.kuehlung = kuehlung;
	}

	
}