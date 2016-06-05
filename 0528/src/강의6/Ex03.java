package 강의6;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int size;

		System.out.println("사이즈입력");
		size = scan.nextInt();

		if (size < 100) {
			System.out.println("small");
		} else if (size >= 100 && size < 200) {
			System.out.println("medium");
		} else if (size >= 200) {
			System.out.println("large");
		}
	}
}
