package pm;

import java.util.Scanner;

public class Ex010 {

	public static void main(String[] args) {
		
		int a=0; 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수값을 입력하시오");
		a=scan.nextInt();
		
		while(a!=0){
			System.out.println(a);
			int b;
			b= scan.nextInt();
			int c;
			c=a+b;
			if(a<0){
				a=0;
			}else
				System.out.println(c);
			if(a==0){
				break;
			}
				
			}
			
		}
	}
