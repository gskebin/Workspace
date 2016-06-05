package 강의4;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final double DOLLAR=1392.83;
		double won ; //스캔 받는 원
		double hwan;
		
		System.out.println("원화를 입력하시오");
		won=scan.nextInt();
		hwan=(won/DOLLAR);
		System.out.println(hwan+"달러");
		
	}
}
