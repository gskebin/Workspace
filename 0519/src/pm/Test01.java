package pm;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		// ctrl + y 다시 실행
		// Scanner s;
		// Date d;
		// ctrl + shift + O = 자동 import

		int n1 ;
		int n2 ;

		int result;
		Scanner scan = new Scanner(System.in);
	 
		System.out.println("첫번째 정수:");
		n1 = scan.nextInt();
		System.out.println("두번째 정수:");
		n2 = scan.nextInt();
		
		result = n1 + n2;

		System.out.println(n1+"이랑"+n2+"을 더하면"+result+"이다");

	}

}
