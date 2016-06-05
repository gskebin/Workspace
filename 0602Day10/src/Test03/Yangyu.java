package Test03;

public class Yangyu {

	private int age;
	
	public Yangyu(){
		System.out.println("양유 기본생성자 호출됨.");
	}

	public Yangyu(int age){
		this.age = age;
		System.out.println("양유 나이를 셋팅하는 생성자 호출됨.");
	}
}