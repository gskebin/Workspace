package 강의5_0521;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double cm;
		
		
		System.out.println("키를 입력하시오");
		cm = scan.nextInt();
		System.out.println(cm+"cm는"+(int)(cm/(12*2.54))+"피트"+cm/(2.54)%12+"인치");
		
	}
}
