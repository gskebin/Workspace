package 강의4;

import java.util.Scanner;

public class Ex00 {

	public static void main(String[] args) {
		int a=0; // 첫번째 숫자
		int b=0; // 두번째 숫자
	
	
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하시오");
		a = scan.nextInt();
		System.out.println("두번째 숫자를 입력하시오");
		b = scan.nextInt();
		int sum=a+b;
		
		System.out.println(sum);
		
	}
}
