package fuhrpark;

public class FuhrparkTest {

	public static void main(String[] args) {
				
		Scooter meinErsterScooter = new Scooter();
		
		meinErsterScooter.setKaufpreis(-3);
		meinErsterScooter.setGewicht(6);
		System.out.println("Kaufpreis " + meinErsterScooter.getKaufpreis()); 
		System.out.println("Gewicht " + meinErsterScooter.getGewicht());

	}

}
