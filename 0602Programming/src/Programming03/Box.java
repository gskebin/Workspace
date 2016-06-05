package Programming03;

public class Box {

	private int h; //높이
	private int w; //너비
	private boolean isEmpty=false; //비었는가 안비엇는가 값
	
	public Box (){
		h=0;
		w=0;
		isEmpty=false;
	}
	public Box(int h, int w, boolean e){
		this.h = h;
		this.w = w;
		isEmpty = e;
	}
	public Box(int h , int w){
		isEmpty = false;
	}
	
	public Box(int h){
		this.w = 0;
		isEmpty = false;
	}
	public void BoxOpen(){
		if(isEmpty==true)
			System.out.println("열려 있습니다");
		
		else 
			System.out.println("닫혀있습니다");
		
	}
}
