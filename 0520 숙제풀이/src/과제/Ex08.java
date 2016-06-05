package 과제;

import java.util.Scanner;

public class Ex08 {

	
		public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			final double SEC=3e5;
			final double DISTANCE=1.5e8;
			
			double time = DISTANCE/SEC;
			
			System.out.println("태양까지 걸리는 시간은"+time+"초");
			
			
					
		}
}
