package am;

public class CarArrayTest {

	public static void main(String[] args) {
	
		final int NUMCAR = 5;
		
		Car[]cars = new Car[NUMCAR];
		
		for(int  i = 0 ; i < cars.length; i++){
			cars[i]= new Car(10,200,"화이트");
		}
		for (int i = 0; i < cars.length; i++) {
			cars[i].speedUp();
		}
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}
}
