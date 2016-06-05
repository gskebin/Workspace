package Circle;

public class Test {

	public static void main(String[] args) {
		
		Point p = new Point(20,30);
		Circle c = new Circle(p,10);
		
		System.out.println(p.toString());
		System.out.println(c.toString());
		
	}
}
