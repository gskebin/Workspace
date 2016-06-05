package pm;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		int a;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		a = scan.nextInt();

		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
