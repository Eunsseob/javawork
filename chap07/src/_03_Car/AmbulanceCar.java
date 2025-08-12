package _03_Car;

public class AmbulanceCar extends Car {

	AmbulanceCar(String model, String company){
		super(model, company);
	}
	
	String siren;
	String firstAid;
	
	String siren(String siren) {
		this.siren = siren;
		System.out.println(siren);
		return this.siren;
	}
	
	String firstAid(String firstAid) {
		this.firstAid = firstAid;
		System.out.println(firstAid);
		return this.firstAid;
	}
}
