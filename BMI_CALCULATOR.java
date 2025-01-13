package ASSIG1;
import java.util.Scanner;

public class ASSIG_1 {
	public static void main(String[] args) {
		Scanner ab= new Scanner(System.in);
		
		System.out.print("Enter your height in (m) :");
		double height= ab.nextDouble();
		
		System.out.print("Enter the your weight in (kg) :");
		double weight= ab.nextDouble();
		
		double BMI= weight/(height*height);
		System.out.printf("YOUR BMI IS:"+BMI);
		
	}
}

