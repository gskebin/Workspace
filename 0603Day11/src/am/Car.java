package am;

public class Car {

	public int speed;
	public int gear;
	public String color;
	
	public Car(int s, int g ,String c){
		speed = s;
		gear = g;
		color = c;
		
	}
	public void speedUp(){
		speed+=10;
	}
	public String toString(){
		
		return "속도: "+ speed + " 기어 :" +gear + " 색상 :"+color;
	}
	
}
