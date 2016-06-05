package am;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Ex03 {

	public static void main(String[] args) {
		
		int years;
		int month;
		int days;
		int week;
		int total=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("연도를입력하시오");
		years=scan.nextInt();
		System.out.println("월을 입력하시오");
		month=scan.nextInt();
		System.out.println("일을 입력하시오");
		days=scan.nextInt();

		total+=(years-1900)*365;
		
		//윤년이고 2월이나 1월이면 결과값-1
		
		if(years%4==0&&(month==2||month==1)){
			total-=1;
		}
		
		
		switch(total%7){
		
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:	
			System.out.println("수요일");
			break;
		case 4:	
			System.out.println("목요일");
			break;
		case 5:	
			System.out.println("금요일");
			break;
		case 6:	
			System.out.println("토요일");
			break;
		case 0:	
			System.out.println("일요일");
			break;
		}
	}
}
