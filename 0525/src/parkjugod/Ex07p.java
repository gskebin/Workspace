package parkjugod;

public class Ex07p {

	public static void main(String[] args) {
		
		int b = 1;
		int c = 0;
		for (int i = 1; i < 11; i++) {
			
			for (int j = 0; j < 10; j++) {
				System.out.println(b+j);
				c = c + (b+j);
			}
			System.out.println(">>>>> c : " + c);
//			System.out.println(b);
			b = i * 10 + 1;
			
			
		}
		
	}
}
