package fuhrpark;

public class Escooter extends Roller {
	private Integer anzahlEscooter;
	private String akkuType;
	private String kfzKennzeichen;
	private double akkuKapazitaet;
	public Integer getAnzahlEscooter() {
		return anzahlEscooter;
	}
	public void setAnzahlEscooter(Integer anzahlEscooter) {
		this.anzahlEscooter = anzahlEscooter;
	}
	public String getAkkuType() {
		return akkuType;
	}
	public void setAkkuType(String akkuType) {
		this.akkuType = akkuType;
	}
	public String getKfzKennzeichen() {
		return kfzKennzeichen;
	}
	public void setKfzKennzeichen(String kfzKennzeichen) {
		this.kfzKennzeichen = kfzKennzeichen;
	}
	public double getAkkuKapazitaet() {
		return akkuKapazitaet;
	}
	public void setAkkuKapazitaet(double akkuKapazitaet) {
		this.akkuKapazitaet = akkuKapazitaet;
	}
	

}
