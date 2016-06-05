package hanbit;

/*
 * 형변환 (Casting): 데이터의 자료형을 변형하는 것
 * 1. 묵시적 형변환(자동형변환) : 컴파일할떄 자동적으로 형이 변환되는 것 
 * 2. 명시적 형변환(강제형변환) : 반드시 형을 변환시켜주어야 함.
 * 
 */

public class Ex04 {

	
			public static void main(String[] args) {
				
				
			long su1 = 128;
			double su2 = su1; 
//			double su2 =(double)<<원칙적으론 적어야됨 su1; 묵시적형변환
			
			System.out.println("결과 : "+su1);
			System.out.println("결과 : "+su2);
			
			float su3 = (float)3.14;
//			float su3 = (float)3.14; 명시적 형변환 (더블값을 작은 float 값에 집어넣으려고 해서)			
			
			int na = 129; 
			byte ko = (byte)na; 
			
			System.out.println("결과:"+ su3);
			System.out.println("결과:"+ ko);
				
				
			}
}
