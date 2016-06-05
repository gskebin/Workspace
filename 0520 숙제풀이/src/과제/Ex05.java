package 과제;

import java.util.Scanner;

public class Ex05 {

		public static void main(String[] args) {
			
			byte length = 0,width,height; //부피 , 길이,너비,높이
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("부피 : ");
			length = scan.nextByte();
			
			System.out.println("길이");
			
			width = scan.nextByte();
			System.out.println("높이");
			height= scan.nextByte();
			
			int volume =length*width*height;
			
			System.out.println("부피는:"+volume);
		
			
			
		}
}
