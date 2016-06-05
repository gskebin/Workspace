package Programming03;

public class PlaneTest {

	public static void main(String[] args) {
		
		Plane p1 = new Plane();
		Plane p2 = new Plane("airbus","A380");
		Plane p3 = new Plane("airbus","A380",500);
		
		System.out.println(p3.toString());
	}	
}