package ASSIG1;

import java.util.Scanner;

public class Prime_no {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.print("Enter an Integer:");
		int n= ab.nextInt();
		
		System.out.println("Prime Numbers upto"+n+":");
		
		for(int num=2; num<=n;num++) {
			boolean isPrime=true;
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(num+" ");
			}
		}
	}
}
