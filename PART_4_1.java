package q4;

public class PART_4_1 {
		
		public class Animal {
			
			public String eat() {
				return "What we eat";
			}
			
		}
		class birds extends Animal{
			public String fly() {
				return "We fly";
			}
		}
		class parrot extends Animal{
			public String speak(){
				return "I can speak";
			}
		}
		
		public static void main(String []args) {
			Q3 q3 = new Q3();
	       parrot parrot = q3.new parrot();
	      
	      
	       System.out.println(parrot.eat());   
	       System.out.println(parrot.speak());
		}
	}


