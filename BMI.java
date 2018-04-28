import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner conversion = new Scanner (System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weight = conversion.nextDouble();
				
		System.out.print("Enter height in inches: ");
		double height = conversion.nextDouble();
		
		double bmi = (weight * 0.45359237) / Math.pow(height * 0.0254, 2);
		System.out.println("BMI is "+bmi+" ") ;

	}

}
