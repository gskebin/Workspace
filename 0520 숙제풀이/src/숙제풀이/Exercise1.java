package 숙제풀이;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
			
		double mile; 
		double kilometer;
		
		//사용자로부터 값을 입력받기 위해 필요함
		Scanner scan = new Scanner(System.in);
		
		System.out.println("마일을 입력하시오:");
		mile = scan.nextDouble(); //사용자가 값을 입력하고 엔터치기를 기다림.
		
		kilometer  = (mile * 1.609);
		
		System.out.println(mile+"마일은" +kilometer+"킬로미터입니다");
		
	}
}
