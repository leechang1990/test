package p02;

import java.util.Scanner;

public class FunctionTest {
	
	static String add(int num1, int num2) {
		return num1 + " + " + num2 + " = " + (num1 + num2);
	}
	public static int asdf(int num1) {
		System.out.println("호출 완료");
		return 0;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println(add(1, 3));
		
		String str="        3          1";
		System.out.println(str.trim());
		s.close();
		
		System.out.println(asdf(1));
		
	}
}