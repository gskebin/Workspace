package 강의6;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int month;//스캔입력
		int year = 2016;
		int days = 0;
	
		System.out.println("일수를 알고 싶은 달을 입력하시오");
		month = scan.nextInt();
		
		switch(month){
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			
			days=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days=30;
			break;
		case 2:
			
			if(((year%4==0)&&(year%100==0))||(year%400==0)){
				days=29;
			}
			else{
				days=28;
			}
			break;
		default:
			System.out.println("월이 잘못입력");
			break;
		}
		System.out.println("월의날수는"+days);
	}
}
