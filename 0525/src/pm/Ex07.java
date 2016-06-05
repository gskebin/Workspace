package pm;

public class Ex07 {

	public static void main(String[] args) {
		
		long a=1;
		for (int i = 1; i <= 100; i++) {
			a+=a;
			System.out.println(a);
			if(i%10==0){
				System.out.println();
			}
			if(i==10){
				a=11;
			}
		}
	}
}
		
	

