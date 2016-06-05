package 강의6_0523;

import java.util.Scanner;

public class Ex00 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[]seat = new int[10];
		int reserv; //스캔 <<
		for (int i =0; i < seat.length; i++) {
			seat[i] = 0;
		}
		
		System.out.println("좌석을 예약하시겠습니까? (1또는 0)");
		reserv = scan.nextInt();//입력받은 값을 배열에 대입
		System.out.println("현재의 예약 상태는 다음과 같습니다");
		System.out.println("----------------------");
		System.out.println(1+" "+ 2 + " " +3+ " "
				+4+" "+5+ " "+ 6 + " " + 7+ " " + 8 + " "+ 9+" "+10 );
		System.out.println("----------------------");
		for (int i = 0; i < seat.length; i++) {
			
			}
		System.out.println("예약되었습니다.");
		System.out.println("좌석을 예약하시겠습니까?(1또는0)");
		
	}
}
