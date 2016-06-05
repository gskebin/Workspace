package Test07;

public class Car {

	private String color;
	private int speed;
	
	private static int numberOfCar =0;
	
	public static int getNumberOfCar(){
		return numberOfCar;
	}
	
	public Car (){
		
		color = "white";
		speed = 100;
		numberOfCar++;
	}
}
