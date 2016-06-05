package Test05;

public class Date {

	private int year;
	private int day;
	private String month;
	
	public Date(){
		
		month = "1월";
		day =1;
		year = 2009;
	}
	
	public Date (int year , String month , int day){
		setDate(year , month , day);
	}
	
	public Date (int year){
		setDate(year , "1월", 1);
	}
	
	public void setDate(int year, String month , int day){
		
		this.month =month;
		this.day = day;
		this.year = year;
	}
	
}
