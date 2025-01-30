package ASSI3;
import java.util.Scanner;
public class q5 {
	private double length;
	private double width;
	
	public q5(double length,double width) {
		this.length=length;
		this.width=width;
	}
	public double area() {
		return length*width;
	}
	public q5 doubledi(q5 rect) {
		rect.length*=2;
		rect.width*=2;
		return rect;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		double length = sc.nextDouble();
		 
		System.out.print("Enter width: ");
		double width = sc.nextDouble();
		
		q5 originalRect = new q5(length, width);
		q5 modifiedRect = originalRect.doubledi(originalRect);
		System.out.println("Original Area: " + originalRect.area());
		System.out.println("Modified Area: " + modifiedRect.area());
	}
}
