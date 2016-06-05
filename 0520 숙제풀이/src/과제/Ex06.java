package 과제;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int five, one, fifth, ten;

		System.out.println("500원 동전개수");
		five = scan.nextInt();
		System.out.println("100원 동전개수");
		one = scan.nextInt();
		System.out.println("50원 동전개수");
		fifth = scan.nextInt();
		System.out.println("10원 동전개수");
		ten = scan.nextInt();

		int total = five * 500 + one * 100 + fifth * 50 + ten * 10;

		System.out.println("합계는" + total + "원");

	}
}
