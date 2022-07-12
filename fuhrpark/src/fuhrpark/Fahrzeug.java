package fuhrpark;

import java.util.Date;

public class Fahrzeug {
	private Date kaufDatum;
	private String fahrzeugKennung;
	private double kaufpreis = 0.0;
	private boolean verfuegbar;
	
	Fahrzeug(){
		kaufpreis = 1.0;
		verfuegbar = true;
	}
	public Date getKaufDatum() {
		return kaufDatum;
	}
	public void setKaufDatum(Date kaufDatum) {
		this.kaufDatum = kaufDatum;
	}
	public String getFahrzeugKennung() {
		return fahrzeugKennung;
	}
	public void setFahrzeugKennung(String fahrzeugKennung) {
		this.fahrzeugKennung = fahrzeugKennung;
	}
	public double getKaufpreis() {
		return kaufpreis;
	}
	public void setKaufpreis(double kaufpreis) {
		if(kaufpreis > -2500) { //eventuell Verschrottung bis 2500 Euro
		this.kaufpreis = kaufpreis;
		}
	}
	public boolean isVerfuegbar() {
		return verfuegbar;
	}
	public void setVerfuegbar(boolean verfuegbar) {
		this.verfuegbar = verfuegbar;
	}
}
