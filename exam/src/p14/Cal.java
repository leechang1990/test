package p14;

import java.util.ArrayList;
import java.util.Scanner;

public class Cal {
	
	public int plus(int x, int y) {
		return x+y;
	}
	public int minus(int x, int y) {
		int temp; 
		if(y>x) {
			temp=x;
			x=y;
			y=temp;
		}
		return x+y;
	}
	public int mul(int x, int y) {
		return x*y;
	}
	public int div(int x, int y) {
		int temp; 
		if(y>x) {
			temp=x;
			x=y;
			y=temp;
		}
		return x/y;
	}
	public int operator() {
		int num1,num2; 
		String oper;
		int value = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("피연산자 두개를 입력해주세요");
		num1=s.nextInt();
		num2=s.nextInt();
		oper=s.nextLine().trim();
		System.out.println("연산자를 입력해주세요");
		oper=s.nextLine().trim();
		if(oper.equals("+")) {
			value=plus(num1,num2);
		}else if(oper.equals("-")) {
			value=minus(num1,num2);
		}else if(oper.equals("*")) {
			value=mul(num1,num2);
		}else if(oper.equals("/")) {
			value=div(num1,num2);
		}else {
			System.out.println("연산자가 잘못 입력되었습니다.");
		}
		s.close();
		return value;
	}
	public void print(ArrayList<Integer> al) {
		for(int i=al.size()-1; i>=0; i--) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		Cal cal = new Cal();
		for(int i=0; i<3; i++) {
			al.add(cal.operator());
		}
		cal.print(al);
	}
}

