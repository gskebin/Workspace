package 상속4;

public class ParentClass {

	int data = 100;
	
	public void print(){
		System.out.println("슈퍼 클래스의 print()메소드");
	}
}

class ChildClass extends ParentClass{
	
	int data = 200;
	
	public void print(){
		super.print();
		System.out.println("서브클래스의 print()메소드");
		System.out.println(this.data);
		System.out.println(super.data);
	}
}

