package 강의5_0521;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int age; //나이
		String name; //이름
		
		System.out.println("이름:");
		name = scan.next();
		System.out.println("나이:");
		age = scan.nextInt();
		
		System.out.println("이름은"+name+"나이는"+age);
		
	}
}
