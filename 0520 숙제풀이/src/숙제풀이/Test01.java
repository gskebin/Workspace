package 숙제풀이;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		double r; // r=반지름
		double pi = 3.141592; // final double Pi(상수는 대문자 관례) = 3.141592;
//		             final int NUMBER_OF_STUDENT=18;

		Scanner scan = new Scanner(System.in);

		System.out.println("반지름 입력:");
		r = scan.nextDouble();

		double d = (2 * pi * r); // 둘레
		double s = (r * r * pi); // 넓이

		System.out.println("둘레:" + d);
		pi = 3.14; // 이러면 밑에 부분은 3.14로 적용되므로 상수로 적용시켜야된다.
		// 그래서 위에 final 을 위에 적용

		System.out.println("넓이:" + s);

	}
}
