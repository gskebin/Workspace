package hanbit;

/*
 * [문제]
 * ---------------실행 결과--------------
 * 	컴퓨터점수 : 
 *  영어점수: 
 *  수학점수:
 *  JAVA점수:
 *  총	점 :
 *  평	균 :
 *  - 단 평균은 소수점 2자리까지만 출력
 */

public class Ex06 {

	
		public static void main(String[] args) {
			
					
			int 컴퓨터 = 90, 영어=80 , 수학 = 85 , JAVA = 100 , 
					총점= (컴퓨터+영어+수학+JAVA);
			
			double 평균 = (컴퓨터+영어+수학+JAVA)/4.0; //int값으로 하면 뒤가 00
			
					
			System.out.println("---------------실행 결과--------------");
			System.out.println("컴퓨터점수:"+컴퓨터);
			System.out.println("영어점수:"+영어);
			System.out.println("수학점수:"+수학);
			System.out.println("JAVA점수:"+JAVA);
			System.out.println("총   점:"+총점);
			System.out.printf("평   균:%.2f",평균);
					
			
			
			}
			
		}
		

