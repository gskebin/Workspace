package Programming01;

public class Cube {

	private double side;
	
	public double getSide(){
		
		return side;
		
	}
	
	public double getVolume(){
		return side*side*side;
	}
	
	public void SetSide(){
		side = 0;
	}
	public void SetSide(int s){
		
		side =s;
	}
}
	
