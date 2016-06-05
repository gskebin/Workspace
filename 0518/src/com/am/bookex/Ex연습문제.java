package com.am.bookex;

/*
 * *** 영수증 출력 ***
 *  지불한 돈 : 15000
 *  아메리카노(ICE) : 3000
 *  수    량  : 
 *  공급가액  : 단가 * 수량 
 *  부가세액  : 공급가액 * 0.1 
 *  상품총액  : 공급가액 + 부가세액
 *  잔    돈  : 지불한 돈 - 상품총액 
 *  
 *  
 */

public class Ex연습문제 {

	
		public static void main(String[] args) {
		
			
			int money = 15000 ,ice =3000 , how =3 , supply =(ice*3);
					
					
		    int tax =(int)(supply*0.1);
			
			int total =(supply + tax);
			 
			int change =(money - total);
			
			System.out.println("*** 영수증 출력 ***");
			System.out.println("지불한 돈 : "+ money);
			System.out.println("아메리카노(ICE) "+ice);
			System.out.println("수   량 : "+how);
			System.out.println("공급가액:" +supply);
			System.out.println("부가세액 " + tax);
			System.out.println("상품총액 :"+total);
			System.out.println("잔    액 :"+change);
			
			
		}
}
