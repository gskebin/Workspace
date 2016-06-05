package 과제;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		String name;
		int age ;
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름:");
		name = scan.next();
		System.out.println("나이:");
		age = scan.nextInt();
		System.out.println("이름은"+name+"나이는"+age+"세 입니다");
		
	}
}
