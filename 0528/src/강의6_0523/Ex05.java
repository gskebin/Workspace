package 강의6_0523;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double x ;
		x = scan.nextDouble();
		
		if(x<=0){
			System.out.println((x*x*x)-(9*x)+2);
		}
		else if(x>0){
			System.out.println((7*x)+2);
		}
	}
}
