package 숙제풀이;

import java.util.Scanner;

public class Exercise3 {

	
	
		public static void main(String[] args) {
			
			double radius , volume;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("반지름을 입력하세요:");
			radius= scan.nextDouble();
			
			volume = (double)(radius*radius*radius)*(4/3);
			
			System.out.println("구의부피는"+volume);
		}
}
