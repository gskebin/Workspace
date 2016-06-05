package Programming03;

public class Plane {

	private String production; //제작사
	private String model; //모델
	private int passenger; //승객수
	
	public String getProduction() {
		return production;
	}
	
	public Plane(){
		
	}
	
	public Plane(String pro , String mo , int pas){
		production = pro;
		model = mo;
		passenger = pas;
	}
	
	public Plane(String pro , String mo){
		
	}
	
	public String toString(){
		return "모델은"+model+"승객수는"+passenger+"제작사는"+production;
	}
	
}
