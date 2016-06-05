package 강의5_0521;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1;
		int num2;

		System.out.println("정수를 입력하시오");
		num1 = scan.nextInt();
		System.out.println("정수를 입력하시오");
		num2 = scan.nextInt();
		
		
		if(num1/num2>0){
			System.out.println(num1+"을 "+num2+"로 나눈 묷은"+(num1/num2)+"이고 나머지는"+(num1%num2));
		}
		else if(num2/num1>0)
			System.out.println(num2+"을"+num1+"로 나눈 몫은"+(num2/num1)+"나머지는"+(num2%num1));
		{
		}
	}

}
