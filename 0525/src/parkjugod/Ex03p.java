package parkjugod;

import java.util.Scanner;

public class Ex03p {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자를 써라 : ");
		int num = s.nextInt();
		
		int n = 1;
		int a = 1;
		while (num / n != 0) {
			
			System.out.println(a + " / " + n);
			a++;
			n = n * 10;
		}
		
	}
}
