package pm;

import java.util.Scanner;

public class Ex01 {

	
	public static void main(String[] args) {

	Scanner in =new Scanner(System.in);
	boolean done = false;
	
	while(done==false){
		System.out.println("q입력시종료");
		String input = in.next();
		if(input.equalsIgnoreCase("q"))
			done = true;
		else 
			System.out.println(input);
	}
	
	}
		
	
	
}
