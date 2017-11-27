package p05;

import java.util.Scanner;

public class ArrayExam2 {
		int num1;
		int num2;
		Scanner s = new Scanner(System.in);
		int[][] Gugudan;
		
		
	void inputGugudan() {
		System.out.println("찍고싶은 구구단의 값을 입력해주세요 ex) 1 2");
		num2 = s.nextInt();
		num1 = s.nextInt();
		Gugudan = new int[num1][num2];
	}
	
	void initGugudan() {
		for(int i=0 ; i< Gugudan.length; i++) {
			for(int j=0; j<Gugudan[i].length; j++) {
				Gugudan[i][j] = (i+1)*(j+1);
			}
		}
	}
	void printGugudan() {
		for(int i=0 ; i< Gugudan.length; i++) {
			for(int j=0; j<Gugudan[i].length; j++) {
				System.out.print((j+1)+" * "+(i+1)+" = " +Gugudan[i][j]);
				System.out.printf("\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//스캐너클래스로 구구단의 취대값을 입력받아 주세요 
		//입력받은 각각의 단 만큼 구구단을 출력하는 프로그램을 작성해주세요.
		ArrayExam2 ae2 =new ArrayExam2();
	
		ae2.inputGugudan();
		ae2.initGugudan();
		ae2.printGugudan();

	}

}
