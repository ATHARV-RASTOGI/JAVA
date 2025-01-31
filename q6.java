package ASSI3;
import java.util.Scanner;
public class q6 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the size of the array: ");
		 int size = scanner.nextInt();
		 
		 int[] arry = new int[size];
		 System.out.println("Enter " + size + " elements:");
		 for (int i = 0; i < size; i++) {
		 arry[i] = scanner.nextInt();
		 }
		int min = arry[0];
		 int max = arry[0];
		 int sum = 0;
		 for (int i = 0; i < size; i++) {
		 if (arry[i] < min) {
		 min = arry[i];
		 }
		if (arry[i] > max) {
		 max = arry[i];
		 }
		sum += arry[i];
		 }
		System.out.println("Minimum number: " + min);
		System.out.println("Maximum number: " + max);
		 System.out.println("Sum of all elements: " + sum);
		 scanner.close();
}
}
