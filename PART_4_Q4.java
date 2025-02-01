package q4;

class Baseclass{
	 private int Num=10;
	 protected int Num2=30;
	 
	 public void Getinfo() {
		 System.out.println("Private no :"+Num);
		 System.out.println("Protected no: "+Num2);
	 }
	 
}
class DerivedClass extends Baseclass{
	public void display() {
		
		System.out.println("Protected being accessed in Derived :"+Num2);
	}
	
}
public class q4 {
	public static void main(String [] args) {
		Baseclass b=new Baseclass();
		b.Getinfo();
		
		DerivedClass d=new DerivedClass();
		d.display();
	}
}
