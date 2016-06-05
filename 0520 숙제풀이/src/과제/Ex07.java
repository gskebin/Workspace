package 과제;

import java.util.Scanner;

public class Ex07 {

	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
//			평구하는 공식 1평=3.3m제곱
			
			
		
			int pyeong;
			
			System.out.println("평수를 입력하시오");
			pyeong = scan.nextInt();
			
			
			final double VALUE = 3.3058;
			
			double x = VALUE*pyeong;
			
			System.out.println(pyeong+"평은"+x+"m제곱 입니다");
			
		}
}
