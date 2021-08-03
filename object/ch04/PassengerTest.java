package ch04;

public class PassengerTest {

	public static void main(String[] args) {
		Passenger passengerDefault = new Passenger();
		
		System.out.println(passengerDefault.showPassengerInfo() + "\n");
		
		Passenger passengerKim = new Passenger("KIM", "A123", "2000.12.12", "SEOUL");
		
		System.out.println(passengerKim.showPassengerInfo());
	}

}
