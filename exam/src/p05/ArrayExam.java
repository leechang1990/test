package p05;

import java.util.Scanner;

public class ArrayExam {

	int num1;
	int num2;
	int[][] numArr;
	Scanner s;
	
	void inpunNum() {
		s= new Scanner(System.in);
		System.out.println("1차원 배열의 길이를 입력해주세요");
		num1 = s.nextInt();
		System.out.println("2차원 배열의 길이를 입력해주세요");
		num2 = s.nextInt();
		numArr= new int[num1][num2];
		s.close();
	}
	void initNumArr() {
		for(int i =0; i<num1; i++) {
			for(int j=0; j<num2; j++) {
				numArr[i][j]=  (i*numArr[i].length) + j+1;
			}
		}
		
	}
	void printNumArr() {
		for(int i =0; i<numArr.length; i++) {
			for(int j=0; j<numArr[i].length; j++) {
				if(j==numArr[i].length-1) {
					System.out.println(numArr[i][j]);	
				}
				else {
					System.out.print(numArr[i][j]+",");
				}	
			}
		}
	}
	public static void main(String[] args) {
		
		ArrayExam ae = new ArrayExam();
		ae.inpunNum();
		ae.initNumArr();
		ae.printNumArr();
	}
}
