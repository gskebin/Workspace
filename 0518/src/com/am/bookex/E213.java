package com.am.bookex;

public class E213 {

		public static void main(String[] args) {
			
			int a = 10;
			int b = 20;
			
			boolean c = (a+=12)>b && (a==(b+=2));
			System.out.println("c="+c);
		}
	
}
