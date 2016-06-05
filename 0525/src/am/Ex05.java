package am;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dan;
		System.out.println("원하는 단을 쓰시오");
		dan =scan.nextInt();
		for (; dan<10; dan++){
			for (int i = 1; i < 10; i++) {
				System.out.println(dan+"x"+i+"="+(dan*i));
			}
			System.out.println(dan+"단 종료");
		}
	}
}
