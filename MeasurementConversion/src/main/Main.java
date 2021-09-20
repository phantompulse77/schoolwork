package main;

public class Main {

	public static void main(String[] args) {
		
		final double MILE_TO_KM = 1.609;
		Converter milesToMeters = new Converter(MILE_TO_KM);
		
		System.out.println(milesToMeters.convertTo(100));
		System.out.println(milesToMeters.convertFrom(100));
	}

}
