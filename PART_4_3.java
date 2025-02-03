package q4;

public class PERSON {
	
	 public String name;
	 public int empid;
	
	 public PERSON (String name) {
		 this.name=name;
	 }
	 public String getname() {
		 return name;
	 }
	 class employee extends PERSON{
		
		
		 public employee(String name,int empid){
			 super(name);
			 this.empid=empid;
		 }
	 }
	 public int getEmployeeId() {
	      return empid;
	  }
	 public class main{
		 public static void main(String [] args) {
			 PERSON person = new PERSON("John") {};
		      employee e = person.new employee("xyz", 8890);
			 System.out.println("Name :"+e.getname());
			 System.out.println("EmployeeId :"+e.getEmployeeId());
		 }
	 }
}

