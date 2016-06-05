package 강의4;

public class Ex01 {

	public static void main(String[] args) {
	
		for(int i =1 ; i <= 5 ; i++ ){
			for(int j = 0; j<6 ; j++){
				if(j==4){
					System.out.println();
				}
				if(i>j){
					System.out.print("*");
				}
			}
		}
	}
}
