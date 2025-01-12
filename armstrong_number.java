package ASSIG1;
import java.util.Scanner;


public class armstrong_number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ENTER THE NO:");
		int num=scanner.nextInt();
		int ogno=num;
		int res=0;
		int n=String.valueOf(num).length();
		
		while(num!=0) {
			int digit =num%10;
			res+=Math.pow(digit,n);
			num /=10;
			
		}
		if(res==ogno) {
			System.out.println(ogno +" is armstromg no");
		}
		else {
			System.out.println(ogno+" not a armstrong no");
		}
	}
}
