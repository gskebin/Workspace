package pm;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		int a = 0;
		while (a <= 100) {
			if (a % 3 == 0 && a % 5 == 0) {
				System.out.print(a);
			if (a % 3 == 0) {
					System.out.print("*");
				}
				if (a % 5 == 0) {
					System.out.print("#");
				}
			} else
				System.out.print("");
			a++;
		}

	}

}
