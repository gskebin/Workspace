package pm;

import java.util.Scanner;

public class E스캐너혼자 {

	public static void main(String[] args) {

		
		int n1, n2, result;
		double n3 ;

		Scanner scan = new Scanner(System.in);

		System.out.println("");
		n1 = scan.nextInt();
		System.out.println("두번째 정수:");
		n2 = scan.nextInt();
		System.out.println("세번째 정수:");
		n3 =scan.nextDouble();
		
		result = n1 + n2 ; 
		
		System.out.println("결과는" + result);
	}

	
}
