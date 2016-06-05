package 강의4;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int salary; //스캔변수
		int sum=0; //합계변수
		int i=1; //증가변수
		while(i<=10){
		System.out.println(i+"년째 월급을 입력");
		salary =scan.nextInt();
		sum+=salary;
		i++;
		}
		System.out.println("월급합계는"+sum);
	}
}
