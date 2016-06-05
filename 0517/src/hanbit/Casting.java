package hanbit;

public class Casting {

	public static void main(String[] args) {
		// 홍길동의 과목별 점수는
		// 국어 : 65점 kor
		// 영어 : 68점 eng
		// 수학 : 62점 math
		// 평균 : 65점 (kor+eng+math)/3
		// 학점 : D

		int kor = 65,eng = 66,math = 62;
		String name = "홍길동";
		int score = (kor + eng + math) /3;
		char 학점 = 'D';

		System.out.println(name + "의 평균 점수는" + score + "점이며" + "학점은 " + 학점 + "입니다.");

	}
}
