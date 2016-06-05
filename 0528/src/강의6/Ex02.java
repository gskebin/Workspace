package 강의6;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int income;//과표
		int tax;//세금
		System.out.println("과표 입력");
		income = scan.nextInt();
		if(income<=1000){
			tax=(int)(0.09*income);
		}
		else if(income<=4000){
			tax=(int)(0.18*income);
		}
		else if(income<8000){
			tax=(int)(0.27*income);
		}
		else{
			tax=(int)(0.36*income);
		}
		System.out.println("소득세는"+tax+"입니다");
	}
}
