package am;

import java.util.Scanner;

public class ArrayTest {

	public final static int STUDENT = 5;
	
	private static void getValues(int[] array){
		Scanner scan = new Scanner(System.in);
		for(int i = 0 ; i < array.length; i++){
			System.out.println("성적입력");
			array[i] = scan.nextInt();
	}
			
}

	private static void getAverage(int[] array){
	
		int total = 0; 
		
		for(int i = 0 ; i < array.length; i++){
		
			total += array[i];
		}
		System.out.println("평균은"+total/array.length+"입니다");
	}
}