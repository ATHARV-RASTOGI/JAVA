package q4;

class person{
	int age;
	String name;
	person(String name,int age){
		this.age=age;
		this.name=name;
	}
	void display() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		
	}
	
}
class Student extends person{
	int sId;
	Student(String name, int age,int sId) {
		super(name, age);
		this.sId=sId;
	}
	void display() {
		super.display();
		System.out.println("Student Id :"+sId);
	}
	
}

public class q5 {
	public static void main(String args[]) {
		Student s=new Student("RAMESH",21,101);
		s.display();
	}

}
