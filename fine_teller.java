package PART_2;
import java.util.Scanner;

public class fine_teller {
	public static void main(String[] args) {
		
		Scanner ab= new Scanner(System.in);
		System.out.print("Enter the speed: ");
		int speed=ab.nextInt();
		
		if( speed<=60) {
			System.out.println("No Fine");
		}
		else if(speed>=61 && speed<=80) {
			System.out.println("100 Rupees fine");
		}
		else if(speed>=81 && speed<=100) {
			System.out.println("250 Rupees fine");
		}
		else {
			System.out.println("500 Rupees fine");
		}
	}
}


