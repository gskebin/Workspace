package com.am.bookex;

/*
 * 삼항연산자
 * 형식) 자료형 변수명 = 조건식 ? 참일때 실행문 : 거짓일때 실행문;
 * -참일때 실행결과와 거짓일때 실행결과는 자료형이 같아야 한다.
 */

public class Ex07 {


		public static void main(String[] args) {
			
			int su1 = 10;
			int su2 = 15;
			int res = (su1 < su2) ? su1+su2 : su1-su2;
			System.out.println("결과:"+res);
			
//			res = (su1 < su2) ? su1+su2 : "안녕" <<int 타입에 String 타입 개입 안됨
			
			int su3 =26;
			String result = ((su3 % 2) == 0 )? "짝수" : "홀수";
			System.out.println("결과:" + result);
	
		
			
			
		}
}
