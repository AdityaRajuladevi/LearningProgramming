package LearningProgramming.random;
public class TrigonometricFunctions {
	public static double sin(double radians) {
		double term = 1.0;
		double sum = 0;
		
		for (int i = 1; term != 0.0; i++) {
			term *= (radians / i);
			
			if (i % 4 == 1)
				sum += term;
			
			if (i % 4 == 3) 
				sum -= term;
		}
		
		return sum;
	}
	
	public static double cos(double radians) {
		double term = 1.0;
		double sum = 1.0;
		
		for (int i = 1; term != 0.0; i++) {
			term *= (radians / i);
			
			if (i % 4 == 0)
				sum += term;
			
			if (i % 2 == 0 && i % 4 != 0)
				sum -= term;
		}
		
		return sum;
	}
	
	public static double tan(double radians) {
		return sin(radians) / cos(radians);
	}
	
	public static void main(String[] args) {
		double angle = 90;
		double radian = (double) ((angle * Math.PI) / 180);
		System.out.printf("%.8f %n", sin(radian));
		System.out.printf("%.8f %n", cos(radian));
		System.out.printf("%.8f %n", tan(radian));
	}
}