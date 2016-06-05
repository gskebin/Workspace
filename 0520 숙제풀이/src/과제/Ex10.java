package 과제;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		// AC:AE=BC:DE

		// ae*bc=ac*de ,de=(ae*bc)/ac

		Scanner scan = new Scanner(System.in);

		int ac, ae, bc;

		System.out.println("AC값");
		ac = scan.nextInt();
		System.out.println("AE값");
		ae = scan.nextInt();
		System.out.println("BC값");
		bc = scan.nextInt();
		
		Double de =(double)(ae*bc)/ac;
		
		System.out.println("DE값:"+de);
		
		

	}
}
