package Test02;

public class Car {

	private String color; //
	private int speed;
	private int gear;
	
	public Car(String c , int s, int g){
		color = c;
		speed = s;
		gear = g;
	}
	
	public Car(){
		color = "red";
		speed = 0;
		gear = 1;
	}
	
	public Car(int speed){
		this.speed = speed;
		color = "blue";
		this.gear = 5000;
	}
	
	public String toString(){
		return " 색상 :" + color + " 속 도:"+speed + " 주행거리"+gear;
	}
}
