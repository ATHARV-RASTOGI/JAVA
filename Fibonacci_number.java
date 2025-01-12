package ASSIG1;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the no of terms :");
		int term=scanner.nextInt();
		
		int fir=1;int sec=1;
		System.out.print("Fabbonaci series :"+ fir+","+sec);
		
		for(int i=3; i<=term; i++) {
			int nexterm= fir+sec;
			System.out.print(","+nexterm);
			fir=sec;
			sec=nexterm;
		}
		
	}
}
