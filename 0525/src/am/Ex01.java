package am;

public class Ex01 {

	public static void main(String[] args) {
		
		for(int i =1; i<=5; i++){
			for(int j=1; j<=5; j++){
				if(i==1){
				System.out.println("*");
				break;
				}else if(i==2){
					System.out.println("**");
				break;
				}else if(i==3){
					System.out.println("***");
				break;
				}else if(i==4){
					System.out.println("****");
				break;
				}else if(i==5){
					System.out.println("*****");
				break;
					}
			}
		}
	}
}
