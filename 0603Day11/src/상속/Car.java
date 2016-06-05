package 상속;

public class Car {

	int speed;
	int gear;
	public String color;
	
	
	public void speedUp(int increment){
		
		speed += increment;
	}
	
	public void speedDown(int decrement){
		speed -= decrement;
	}
}

class SportsCar extends Car{

	boolean turbo;
	
	public void setTurbo(boolean t){
		turbo = t;
	}
	
	public boolean getTurbo(){
		return turbo;
	}
	public int getSpeed(){
		return speed;
	}
}
