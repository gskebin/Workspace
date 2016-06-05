package Test04;

public class Car {

	private String color; 
	private String model;
	private int speed;
	
	public Car(){
		this(0,"sonata","white");
		System.out.println("매개변수 없는 생성자");
	}
	
	public Car(int s){
		this(s,"sonata","white");
		System.out.println("매개변수 1개 생성자");
	}
	
	public Car(int s , String m, String c){
		
		speed =s;
		model =m;
		color = c;
		System.out.println("매개변수 3개 생성자");
	}
	
	public String toString(){
		return "속도:"+speed+",모델:"+model+",색상"+color;
	}
	
	
}