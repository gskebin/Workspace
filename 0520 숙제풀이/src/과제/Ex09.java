package 과제;

import java.util.Scanner;

public class Ex09 {

	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int p , s ; 
			
			System.out.println("힘의 값");
			p= scan.nextInt();
			System.out.println("넓이의 값");
			s = scan.nextInt();
			double pressure =(double)p/s;  
			
			System.out.println("압력의 세기는"+pressure);
			
			
			
		}
}
