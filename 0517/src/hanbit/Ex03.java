package hanbit;

public class Ex03 {

	public static void main(String[] args) {
		
				int kor = 90;
				int eng = 80;
				int mat = 90;		
		
				int tot = kor + eng + mat;
				double avg = tot /3; 
				double avg1 = tot /3.0;
				
				System.out.println("결과 : " +tot);
				System.out.println("결과 : " +avg);
				System.out.println("결과 : " +avg1);
//			%d : 정수자리, %f : 실수자리 , %s : 문자열 자리, %c : 문자 자리
				System.out.printf("%s 합계 : %d 평균: %.3f","결과: ",tot,avg1);
		
//					d는 10진수 .n f 는 n자리 까지 표시 ,뒤에 랑 1:1 매칭
				
			
	
	}
}
