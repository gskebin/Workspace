package parkjugod;

public class Ex09p {

	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		String jStr = "";
		while (true) {
			
			i++;
//			System.out.println(">>>>> i : " + i);
			
			if(i%2 == 0){
				i = i * -1;
				jStr = jStr + " + (" + Integer.toString(i) + ")";
				j = j + i;
				i = i * -1;
			} else {
				jStr = jStr + " + " + Integer.toString(i);
				j = j + i;
			}
//			System.out.println(">>>>> j : " + j);
			
			
			if(i > 100){
				System.out.println(jStr);
				System.out.println(">>>>> res  i : " + i);
				System.out.println(">>>>> res  j : " + j);
				break;
			}
			
		}
	}
}
