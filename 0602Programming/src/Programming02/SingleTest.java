package Programming02;

public class SingleTest {

	public static void main(String[] args) {
		
		Single obj1 = Single.getInstance();
		Single obj2 = Single.getInstance();
		
		System.out.println(obj1.getInstance());
		System.out.println(obj2.getInstance());
	}
}
