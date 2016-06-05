package hanbit;

/*실수형 : 소숫점이 존재하는 수
 * float < double (실수의 기본형은 double)
 * float형은 숫자 뒤에 f또는 F를 붙인다(생략하면 오류발생)
 * 정수 (int) + 실수 (float) = 실수
 */

public class Ex02 {

		public static void main(String[] args) {
			
			float su1 = 3.14f;
			double su2 = 3.14;
			float su3 = 3 + 0.14f;
			double su4 = 3 +0.14;
			float  su5 = 3 + 0.14f;
			
			System.out.println(su1);
			System.out.println(su2);
			System.out.println(su3);
			System.out.println(su4);
			System.out.println(su5);
				
			
			
		}
	
}
