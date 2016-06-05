package com.am.bookex;

/*
 * java에서 제공하는 연산자 
 *-산술연산자 :+,-,*,/,%
 *-관계연산자 : >=, > , == , !=, < , <=
 *-논리연산자 : 논리곱(&& - AND) , 논리합(|| - OR ) , 부정 ( ! - NOT )
 *-이항연산자 , 삼항연산자 , 단항연산자 , 비트 연산자 , 시프트연산자    
 */

public class Ex03 {

	
		public static void main(String[] args) {
			
//			단항연한자 : 항이 한개밖에 없는 연산자.
//			증감연산자 : ++(1증가시킨다) , --(1감소시킨다)
			int su = 10;
			int num = 10;
			++su; 
			num++;
			System.out.println("결과 : " + su);
			System.out.println("결과 : "+ num);
			System.out.println(); //빈 한줄
			System.out.println("결과 :" + (++su));
			System.out.println("결과 :" + (num++));
			
			int num1 = 10;
			int num2 = 20;
			System.out.println((++num1)); //11
			System.out.println((++num1)+(num2++)); //12+20 
			System.out.println((++num1%3)+(num1 * (++num2)));// 13/3 ->나머지1 , 13*22
			
		}
		
		
}
