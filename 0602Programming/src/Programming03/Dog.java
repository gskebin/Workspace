package Programming03;

public class Dog {

	String name;
	String breed;
	int age;

	public Dog(String n, int a) {
	
		name = n;
		age =a;
	}

	public Dog(String n, String breed, int a) {
		name = n ;
		this.breed = breed;
		age = a;
	}
}
