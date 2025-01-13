package ASSIG1;

import java.util.Scanner;

public class pattern {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.print("Enter an Integer:");
		int n= ab.nextInt();
		for(int i=1; i<=n; i++) {
			for (int j=1;j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
}
}
