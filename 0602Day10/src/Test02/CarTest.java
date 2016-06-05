package Test02;

public class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car("white",10,20);
		Car c2 = new Car();
		Car c3 = new Car(500);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}
}
