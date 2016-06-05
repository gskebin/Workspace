package 강의6_0523;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int tall; //키
		
		System.out.println("키를 입력");
		tall=scan.nextInt();
		double standard =(tall-100)*0.9; //표준체중
		
		if(standard>=90&&standard<=100){
			System.out.println("과체중");
		}
		else if(standard>=80&&standard<=90){
			System.out.println("정상체중");
		}
		else{
			System.out.println("저체중");
		}
		
	}
}
