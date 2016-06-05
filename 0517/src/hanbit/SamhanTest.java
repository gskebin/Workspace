package hanbit;

public class SamhanTest {

	public static void main(String[] args) {

		int a = 10, b = 15;

		String result = (a > b) ? (a - b) + "만큼a가 크다" : (b - a) + "만큼b가 크다";
		//()?:;
		//result = (a > b) ? (a - b) + "만큼a가 크다" : (b - a) + "만큼b가 크다";
//		교재건 최적화가 덜되었다
		System.out.println(result);

	}
}
