package hanbit;

/*
 * String 클래스
 * - 기본 자료형은 아니지만 기본 자료형처럼 사용됨
 * 반드시 "문자열"처럼 쌍따옴표를 사용할 것
 */
public class Ex05 {

	
		public static void main(String[] args) {

			String name = "홍길동"; //기본자료형처럼 사용한다
			System.out.println(name);
			
//			주의사항 
//			문자열 + 숫자 = 문자열
//			문자열 + 문자열 = 문자열
//			숫자 + 문자열 = 문자열
//			위 3개의 + 기호는 덧셈이 아니라 문자 결합(결합연산자)로 생각
			
//			숫자+숫자 = 숫자 =>이 경우만 덧셈의 의미
			
			System.out.println("10"+"2"); //102(문자열)
			System.out.println(10+"2"); //102(문자열)
			System.out.println(10+2);  //12(숫자)
			
			
			
			
		
		}
}
