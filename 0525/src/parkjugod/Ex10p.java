package parkjugod;

import java.util.Scanner;

public class Ex10p {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("임의의 정수 : ");
		num = scan.nextInt();
		
		int n = 1;
		int a = 0;
		int b = 0;
		while (true) {
			
			if(num / n == 0){
				break;
			}
			n = n * 10;
			System.out.println(num%n + "   " + (num%n)/(n/10));
			a++;
			
			b = b + (num%n)/(n/10);
		}
		System.out.println(">>>>> b : " + b);
		
	}
}
