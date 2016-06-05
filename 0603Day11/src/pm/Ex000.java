package pm;

public class Ex000 {

	public static void main(String[] args) {
		
		int[]list ={1,2,3,4,5,6,7,8};
		int count=0;
		
		for(int cou : list){
				if(cou%2==0){
					count++;
				}
			}
		System.out.println(count);
		}
	
	}
