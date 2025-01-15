package PART_2;
import java.util.Scanner;

public class mini_calculator {
	public static void main(String[]args) {
		Scanner a=new Scanner(System.in);
		System.out.print("Enter the first no: ");
		int num1=a.nextInt();
		
		System.out.print("Enter the second no: ");
		int num2=a.nextInt();
		
		System.out.println("1.add");
		System.out.println("2.sub");
		System.out.println("3.multi");
		System.out.println("4.divide");
		System.out.print("Enter the choise :");
		
		int num_ans=a.nextInt();
		
		switch (num_ans) {
		  case 1:
		    System.out.println("THE SUM OF NUMBER IS :" + num1+num2);
		    break;
		  case 2:
		    System.out.println("THE DIFFERENCE OF NUMBER IS :" + (num1-num2));
		    break;
		  case 3:
		    System.out.println("THE MULTIPLICATION OF NUMBER IS :"+ num1*num2);
		    break;
		  case 4:
		    System.out.println("THE DIVISION OF NUMBER IS :"+ num1/num2);
		    break;
		}
	}
}

