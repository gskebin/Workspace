package 숙제풀이;

import java.util.Scanner;

public class Exercise4 {

	
	public static void main(String[] args) {
		
		// 섭씨 = 5/9*(f-32); 
		
		double f ,c  ; 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("화씨 온도 입력");
		
		f = scan.nextDouble();
		
		c =(double)5/9*(f-32);
		
		System.out.println("섭씨:"+c);
		
		
	}
			
}
