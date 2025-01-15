package PART_2;
import java.util.Scanner;

public class mini_advanced_calculator {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
   	while (true)
   	{
			System.out.println();
   		System.out.println("1)Perform arithmetic operations\n2)Check Even/Odd\n3)Print multiples\n4)Calculate Factorial\n5)Exit");
			System.out.println("Enter your choice:");
	        int ch = input.nextInt();
	       
	        if (ch==1)
	        {
	        	System.out.println("Enter first number:");
	            int a = input.nextInt();
	           
	            System.out.println("Enter second number:");
	            int b = input.nextInt();
	           
	            System.out.println("Enter operator (+,-,*,/):");
	            char o = input.next().charAt(0);
	           
	            switch(o)
	            {
	            case '+':
	            	System.out.println("Sum: " + (a+b));
	            	break;
	            case '-':
	            	System.out.println("Difference: " + (a-b));
	            	break;
	            case '*':
	            	System.out.println("Product: " + (a*b));
	            	break;
	            case '/':
	            	System.out.println("Division: " + (a/b));
	            	break;
	            }
	        }
	        else if (ch==2)
	        {
	        	System.out.println("Enter number:");
	            int a = input.nextInt();
	           
	            if(a%2==0)
	            {
	            	System.out.println("Even");
	            }
	            else
	            {
	            	System.out.println("Odd");
	            }  
	        }
	        else if (ch==3)
	        {
	        	System.out.println("Enter number:");
	            int a = input.nextInt();
	            System.out.println("Multiples are:");
	            for(int i=1;i<11;i++)
	            {
	            	System.out.println(a*i);
	            }
	        }
	        else if(ch==4)
	        {
	        	System.out.println("Enter number:");
	            int a = input.nextInt();
	            int fact=1;
	            for(int i=a;i>0;i--)
	            {
	            	fact=fact*i;
	            }
	            System.out.println("Factorial is:" + fact);
	        }
	        else if(ch==5)
	        {
	        	System.out.println("Exiting");
	        	break;  
	        }
	        else
	        {
	        	System.out.println("Wrong option selected");
	        }
   	}
	}
}

