package pm;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		int a;
		int b=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하시오");
		a = scan.nextInt();
		
		while(a!=0){
			System.out.println(a);
			if(a<0){
				a=0;
			}
			
			a=a+b;
			
			if(a==0){
				break;
			}
			}
		}
	}

