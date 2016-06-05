package 강의4;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int salary; //월급
		int deposit; //저축액
		
		System.out.println("월급 입력");
		salary = scan.nextInt();
		deposit = salary*12*10;
		System.out.println("저축액은 :"+deposit);
	}
}
