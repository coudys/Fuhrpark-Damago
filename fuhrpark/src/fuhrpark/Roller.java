package fuhrpark;

public class Roller extends Fahrzeug {
	private String farbe;
	private Integer zuladungInKG;

	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public Integer getZuladungInKG() {
		return zuladungInKG;
	}
	public void setZuladungInKG(Integer zuladungInKG) {
		this.zuladungInKG = zuladungInKG;
	}
}
