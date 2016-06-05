package 강의6_0523;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		//모음 a ,e , i , o , u
		
		Scanner scan = new Scanner(System.in);
		
		String spell;
		
		System.out.println("영문자입력");
		spell = scan.next();
		
		
		switch(spell){
		
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			
		System.out.println(spell+"은 모음");
		 break;
		 
		default:
			System.out.println(spell+"은 자음");
		}
	}
}

