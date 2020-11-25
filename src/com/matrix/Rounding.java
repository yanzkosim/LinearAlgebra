package com.matrix;

public class Rounding {
	public int coma;
	
	public double rounding(double number) {
		long holder = 1;
		for(int i=0; i<coma; i++) {
			holder *= 10;
		}
		double temp = number * holder;
		double result = Math.round(temp) / holder;
		
		return result;
	}
}
