package p01;

import java.util.Scanner;

public class Exam02 {
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("변수 1의값을 입력해주세요");
		int a = s.nextInt();
		System.out.println("변수 2의값을 입력해주세요");
		int b = s.nextInt();
		System.out.println("연산자를 입력해주세요");
		String op = s.nextLine().trim();//trim() 은 양끝 공백문자를 없애 주는 함수 
		int result=0;
		if(op.equals("+")) {
			result= a+b;
		}
		else if(op.equals("-")) {
			result= a-b;
		}
		else if(op.equals("*")) {
			result= a*b;
		}
		else if(op.equals("/")) {
			result= a / b ;
		
		}
		else if(op.equals("%")) {
			result= a % b ;
		
		}
		else {
			System.out.println("잘못된 입력");
			System.exit(0);
		}
		System.out.println("result=" +result);
		s.close();
	}
}

