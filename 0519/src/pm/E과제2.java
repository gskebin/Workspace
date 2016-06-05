package pm;

import java.util.Scanner;

public class E과제2 {

	
		public static void main(String[] args) {
			
			int money , total  ;
			int rest =2500;
			int tax = 750;
			
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("받은돈:");
			money = scan.nextInt();
			System.out.println("상품의 총액");
			total = scan.nextInt();
			System.out.println("부가세:"+tax);
			System.out.println("잔돈:"+rest);
			
			
			
			
			
		}
}
