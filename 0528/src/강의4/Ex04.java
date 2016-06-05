package 강의4;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int radius;// 스캔 반지름 입력받음
		double res; //입력받아 출력 그릇
		
		System.out.println("반지름을 입력하시오");
		radius = scan.nextInt();
		res =(double)(radius*radius)*3.14;
		System.out.println("결과는 "+ res);
		
	}
}
