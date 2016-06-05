package 과제;

import java.util.Scanner;

public class Ex03 {

	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int cm ;
			
			System.out.println("키를 입력하십시오");
			cm = scan.nextInt();
			double inch = 2.54;
			double pit =(double)12*inch;
			double res =(double)(cm/2.54);
			
			System.out.println(cm+"cm는"+pit+"피트"+res+"인치입니다");
			
			
			
		
		}
}
