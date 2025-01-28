
package ASSI3;
import java.util.Scanner;
public class ASS3_1 {
	private String Name;
	private int roll_no,math,English,Comp,total;
	private double avg_marks;
	
	Scanner ab=new Scanner(System.in);
	
	public void ini() {
		System.out.print("Enter your Name:");
		Name=ab.nextLine();
		
		System.out.print("Enter your Roll_no :");
		roll_no=ab.nextInt();
		
		System.out.print("Enter the mats Marks:");
		math=ab.nextInt();
		
		System.out.print("Enter the Computer Marks:");
		English=ab.nextInt();
		
		System.out.print("Enter the Eng Marks:");
		Comp=ab.nextInt();
	}
	public void calcavg() {
		total=math+English+Comp;
		avg_marks=total/3.0;
		
	}
	public void info() {
		System.out.println("Name :"+Name);
		System.out.println("Roll_no :"+roll_no);
		System.out.println("Total_no :"+total);
		System.out.println("Average Marks :"+avg_marks);
		
	}
	public static void main(String args[]) {
		 ASS3_1 S= new  ASS3_1();
		S.ini();
		S.calcavg();
		S.info();
	}
}
