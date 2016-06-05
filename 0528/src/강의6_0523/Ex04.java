package 강의6_0523;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		int a; //1번쨰정수
		int b; //2번쨰
		int c; //3번째
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째정수");
		a = scan.nextInt();
		
		System.out.println("두번째정수");
		b = scan.nextInt();
		
		System.out.println("세번째정수");
		c = scan.nextInt();

		if(a>b&&b>c&&a>c){
			System.out.println(c+","+b+","+a);
		}
			
	}
}
