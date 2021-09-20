package main;

public class Converter {
	
	private double factor;
	
	public Converter(double aConversionFactor) {
		factor = aConversionFactor;
	}
	
	public double convertTo(double fromMeasurement) {
		
		double result = fromMeasurement;
		result *= factor;
		
		return result;
	}
	
	public double convertFrom(double toMeasurement) {
		double result = toMeasurement;
		result /= factor;
		
		return result;
	}

}
