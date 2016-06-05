package Programming01;

public class MyMetric {

	public static double killometer;
	public static double mile;
	
	public static void kiloTomile(){
		
		mile = killometer*1.609;
	}
	
	public static void mileToKilo(){
		
		killometer = mile*0.6213;
	}
	
	public void getKilo(){
		System.out.println(killometer);
	}
	public void getMile(){
		System.out.println(mile);
	}
	
}
