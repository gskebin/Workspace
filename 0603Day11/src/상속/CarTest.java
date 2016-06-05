package 상속;

public class CarTest {

	public static void main(String[] args) {
		
		SportsCar c1 = new SportsCar();
		
		c1.speedUp(20);
		c1.speedUp(20);
		c1.setTurbo(true);
		System.out.println(c1.getTurbo());
		System.out.println(c1.getSpeed());
	}
}
