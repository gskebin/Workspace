package 강의6;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final int RATE = 5000;
		
		int hours;
		
		System.out.println("시간입력");
		hours = scan.nextInt();
		int pay=RATE*hours;
		
		if(hours>8){
			System.out.println(pay+(int)((1.5)*(hours-8)*RATE));
		}
		else{
			System.out.println(pay);
		}
	}
}
