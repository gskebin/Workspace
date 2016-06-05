package am;

import java.util.Scanner;

public class En팩토리얼 {

	public static void main(String[] args) {
		
		long fact=1;
		int a;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		a= scan.nextInt();
		
		for (int i = 1; i <= a; i++) {
			fact =fact*i;
			System.out.println(fact);
		}
		}
		
	}
