package am;

import java.util.Scanner;

public class E구구단중첩거꾸로 {

	public static void main(String[] args) {
		
		int dan;
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 단을 쓰시오");
		dan =scan.nextInt();
		
		for(; dan<10; dan++){
			for(int i=9; i>0; i--){
				System.out.println(dan+"x"+i+"="+(dan*i));
			}
			System.out.println(dan+"단 종료");
		}
	}
}
