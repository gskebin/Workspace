package Programming03;

public class BoxTest {

	public static void main(String[] args) {
		
		Box b1 = new Box();
		Box b2 = new Box(3,4,true);
		Box b3 = new Box(3);
		
		b1.BoxOpen();
		b2.BoxOpen();
		b3.BoxOpen();
	}
}
