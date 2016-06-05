package am;

import java.util.Scanner;

public class E구구단중첩for {

	public static void main(String[] args) {

		for (int dan=2; dan < 10; dan++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(dan + "x" + j + "=" + (dan * j));
			}
			System.out.println(dan+"단종료");
		}
	}

}
