package q4;
public class shape {
	
	public static class shapes {
	    public double area() {
	        return 0;
	    }
	}
	static class Circle extends shapes {
	    private double radius;
	    public Circle(double radius) {
	        this.radius = radius;
	    }
	    public double area() {
	        return 3.14 * radius * radius;
	    }
	}
	static class Rec extends shapes {
	    private int length;
	    private int width;
	    public Rec(int length, int width) {
	        this.length = length;
	        this.width = width;
	    }
	 
	    public double area() {
	        return length * width;
	    }
	}
   public static void main(String[] args) {
       Circle c = new Circle(23);
       System.out.println("AREA of Circle: " + c.area());
       Rec r = new Rec(12, 3);
       System.out.println("AREA of Rectangle: " + r.area());
   }
}
