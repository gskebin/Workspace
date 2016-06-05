package com.am.bookex;

/*
 * 대입(배정)연산자: 변수 데이터나 상수 데이터를 기억시킬 때 사용
 * - 좌변 = 우변 : 우변의 데이터를 좌변의 변수에 기억(저장)시킨다.
 */

public class Ex06 {

	
		public static void main(String[] args) {
			
		    int su = 10;
		    System.out.println("결과 : "+su);

//		    += : 왼쪽변수와 오른쪽 데이터를 더한 후 왼쪽변수에 저장
		    su += 5; // su = su+5; 누적변수
		    
	    	// -= : 왼쪽변수와 오른쪽 데이터를 뺀 후 왼쪽변수에 저장
		    su -=5; // su = su-5;
		   
		    
		}
}
