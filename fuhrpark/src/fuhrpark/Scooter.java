package fuhrpark;

public class Scooter extends Roller {
	private Integer anzahlScooter;
	private Integer gewicht;
	private boolean klappbar;
	
	Scooter() {
		// kaufpreis = 2.0;
		setKaufpreis(3.0);
	}
//	public void setKaufpreis(double kaufpreis) {
//		if (kaufpreis > -100) {
//			super.setKaufpreis(kaufpreis);
//	
//		}
//	}
	public Integer getAnzahlScooter() {
		return anzahlScooter;
	}
	public void setAnzahlScooter(Integer anzahlScooter) {
		this.anzahlScooter = anzahlScooter;
	}
	public Integer getGewicht() {
		return gewicht;
	}
	public void setGewicht(Integer gewicht) {
		this.gewicht = gewicht;
	}
	public boolean isKlappbar() {
		return klappbar;
	}
	public void setKlappbar(boolean klappbar) {
		this.klappbar = klappbar;
	}
	
	
}
