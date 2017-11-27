package p03;

import java.util.Scanner;

public class ObjectExam {
	public int num1;//멤버변수 
	public int num2;
	
	public ObjectExam(){//생성자 new라는 연산자와함께 주소값을 할당해줌 
				//메모리를 생성할때만 호출 가능  파라메터 가능  변수 초기화가능 출력가능
	//	System.out.println("기본 생성자를 호출 하셨군요!");
	}
	
	void add(int num1, int num2) {
		System.out.println("둘의 합은" + (num1+num2));
	}
	
	
	int getNum2(int num2) {
		return num2;
	}
	
	public void inputNums() {
		
		Scanner s = new Scanner(System.in);//이것도 생성자 
		System.out.println("첫번째 숫자를 입력해주세요: ");
		num1 = s.nextInt();
		System.out.println("두번째 숫자를 입력해주세요: ");
		num2 = s.nextInt();
		s.close();
	}
	
	public void printLoop() {
		
		for(int i=num1; i<num2; i++) {
			System.out.print(i);
			if(i!=(num2-1)) {
			System.out.print(",");
			}
			
		}
		System.out.println();
	}
	int add() {
		return num1+num2;
	}
	public void swap() {
		int swap;
		swap=num1;
		num1=num2;
		num2=swap;
		
	}

	
	
	public static void main(String[] args) {
		
		ObjectExam o ;
		o = new ObjectExam(); // 생성자 클래스와 같은 생성자명이 없으면 기본 생성자를 만든다
								//얜 무조건 호출해야함 
								//아무것도 없는 생성자를 기본 생성자라 한다.
		o.inputNums();
		//o.printLoop();
		
	}

}
