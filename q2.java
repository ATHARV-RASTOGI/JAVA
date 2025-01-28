package ASSI3;

public class q2 {
	private String name;
	private int age;
	
	q2 (String name ,int age){
		this.name=name;
		this.age=age;
	}
	
	public void display_info() {
		System.out.println("Name is :" +name);
		System.out.println("Age:"+age);
	}
	public static void main(String args []) {
		q2 p=new q2("ATHARV",19);
		p.display_info();
	}
}
