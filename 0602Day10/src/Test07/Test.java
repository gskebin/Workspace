package Test07;

public class Test {

	public static void main(String[] args) {
		
//		System.out.println("현재 차량의 수:"+Car.numberOfCars);
		System.out.println("현재 차량의 수:"+Car.getNumberOfCar());
		Car myCar = new Car();
		
		Car yourCar = new Car();
		System.out.println("현재 차량의 수:"+Car.getNumberOfCar());
		
	}
}
