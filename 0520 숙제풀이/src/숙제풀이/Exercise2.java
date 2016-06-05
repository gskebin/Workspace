package 숙제풀이;

import java.util.Scanner;

public class Exercise2 {

	
	public static void main(String[] args) {
		
		int receiveMoney, totalPrice , tax ,change ; 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("받은 돈 :");
		receiveMoney = scan.nextInt();
		System.out.println("상품의 총액:");
		totalPrice = scan.nextInt();
		
		tax = (int)(totalPrice*0.1); //만약 소수점이하 숫자가 있으면 짤림.
		change = receiveMoney - totalPrice ;
		System.out.println("부가세:"+tax);
		System.out.println("잔돈:"+change);
		
		
	}
	
}
