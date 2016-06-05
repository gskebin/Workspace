package pm;

import java.util.Scanner;

public class E과제3 {

	public static void main(String[] args) {

		double ban;
		double r;

		Scanner scan = new Scanner(System.in);

		System.out.println("반지름 값을 입력 하십시오:");
		ban = scan.nextDouble();

		r = ((4 / 3) * (ban * ban * ban));

		System.out.println((4 / 3) * (ban * ban * ban));

	}
}
