package 과제;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		int integer ,integer2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오");
		integer = scan.nextInt();
		System.out.println("정수를 입력하시오");
		integer2 = scan.nextInt();
		double fomu =(double)integer2/integer; 
		double last =(double)integer2%integer;
		
		System.out.println(integer2+"을"+integer+"로 나눈몫은"+fomu+"이고 나머지는"+last);
		
	}
}
