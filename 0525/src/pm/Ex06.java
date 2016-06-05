package pm;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int d;
		int e;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수값 입력");
		a=scan.nextInt();
		if(a<0){
			System.out.println("첫번째 정수값 재입력");
			a=scan.nextInt();
		}
		System.out.println("두번째 정수값 입력");
		b=scan.nextInt();
		if(b<0){
			System.out.println("두번째 정수값 재입력");
			b=scan.nextInt();
		}
		System.out.println("세번째 정수값 입력");
		c=scan.nextInt();
		if(c<0){
			System.out.println("세번째 정수값 재입력");
			c=scan.nextInt();
		}
		System.out.println("네번째 정수값 입력");
		d=scan.nextInt();

		if(d<0){
			System.out.println("네번째 정수값 재입력");
			d=scan.nextInt();
		}
		System.out.println("다섯번째 정수값 입력");
		e=scan.nextInt();
		
		if(e<0){
			System.out.println("다섯번째 정수값 재입력");
			e=scan.nextInt();
		}
	
		
		
		
		System.out.println(a+b+c+d+e);
	}
}
