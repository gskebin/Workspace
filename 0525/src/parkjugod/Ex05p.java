package parkjugod;

import java.util.Scanner;

public class Ex05p {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a;
		int b=0;
		while (true) {
			
			a = scan.nextInt();
			// a == 0
			if(a == 0){
				// break
				System.out.println("종료");
				break;
			}
			
			// a > 0
			if(a > 0){
				// b = b + a
				b = b + a;
			}
			
			// a < 0
			if(a < 0){
				// 아무것도 안함
				System.out.println("음수입니다.");
			}
			System.out.println(">>>>> b : " + b);
		}
	}
}
