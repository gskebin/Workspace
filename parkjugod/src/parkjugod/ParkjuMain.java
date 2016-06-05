package parkjugod;

import java.util.Scanner;

public class ParkjuMain {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 몬스터의 수
		int a = 0;
		
		System.out.println("몬스터의 수 : ");
		a = scan.nextInt();
		
		// 몬스터당 횡강 갯수
		int[] wCnt = new int[a];
		
		int totCnt = 0;
		
		float wAtkRate = 0.1f; 
		
		// 콤보수
		int combo = 1;
		
		// 콤보당 공격력 
		float comboAtkRate = 0.25f;
		
		// 공격력
		int[] atk = new int[a];
		
		
		for (int i = 0; i < wCnt.length; i++) {
			System.out.println((i + 1) +"번째 횡강갯수 : (총 " + wCnt.length + "마리)" );
			wCnt[i] = scan.nextInt();
		}
		
		String str = "";
		for (int i = 0; i < wCnt.length; i++) {
			str = str + wCnt[i] + ", ";
			totCnt = totCnt + wCnt[i];
		}
		System.out.println(str + ", 횡강 갯수 : " + totCnt);
		wAtkRate = (wAtkRate * totCnt) + 1;
		
		System.out.println( "wAtkRate : " + wAtkRate);
	}
	
}
