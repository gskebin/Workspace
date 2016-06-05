package 상속2;

public class Employee {

	public String name; // 공용멤버
	String adress;    //주소
	protected int salary; //월급 <<보호
	public int RRN; //주민번호
	
	public String toString(){
		return name+" , "+adress + " , "+RRN+ " , "+ salary;
	}
	
}

class Manager extends Employee{
	
	private int bonus;
	
	public void printSalary(){
		System.out.println(name+"("+adress+"):"+(salary+bonus));
	}
	public void printRRN(){
		System.out.println(RRN);
	}
}
