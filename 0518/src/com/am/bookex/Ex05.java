package com.am.bookex;

/*
 * 논리연산자 
 * -논리곱(&& - AND ) :주어진 조건이 모두 참(true)인 경우 결과가 true 
 *  false를 만나면 결과는 false. 뒤의 조건을 계산하지 않음.
 *  -논리합(||-OR) : 주어진 조건 중 하나만 true 여도 결과가 true . 
 *  true 를 만나면 결과는 true . 뒤에 조건을 계산하지 않음.
 *  -논리연산자의 결과는 boolean 형이다. (조건식에 많이 사용됨) 
 */

public class Ex05 {

	  public static void main(String[] args) {
		
		  int su1 = 10;
		  int su2 = 7;
		  boolean res = (su1>=7) && (su2>=5);
		  System.out.println("결과 : "+res);
		 
//		  su1 < 7 : false , su2 >=5: true
		  res = (su1<7) && (su2 >=5);
		  System.out.println(res); //false 
//		  su1 > = 7 : true , su2 < 5 : false 
		  
		  res = (su1>=7) && (su2<5);
		  
		  System.out.println(res);
		  
		  res = (su1 >=7 ) || (su2 >=5);
		  System.out.println(res);
		  
		  res = (su1>=7) || (su2 < 5 );
		  System.out.println("결과 :" + res);
		  
		  int num1 = 10;
		  int num2 = 20;
		  boolean res2 = 
		  (num1 = num1 + 12)>num2 && (num1 == (num2=num2+2));
		  System.out.println("num1="+num1+",num2 = "+num2+ ",결과 : "+res2);
		  
		  
		 int num3 = 10;
		 int num4 = 20;
		 boolean res3=
		((num3 = num3 + 12)>num4 ) || (num3 ==(num4=num4+2));
		
		 System.out.println("num3="+num1+",num4="+num2+",결과 : "+res3);
		 

	  }
}
