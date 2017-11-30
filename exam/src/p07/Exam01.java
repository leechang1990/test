package p07;

import java.util.Scanner;

public class Exam01 {
	int num[] = new int[5];
	int mul =0;
	
	void inputNums() {
		Scanner s = new Scanner(System.in);
		for(int i= 0; i<5; i++) {
			System.out.println((i+1)+"번재 숫자를 입력해주세요");
			num[i] = s.nextInt();
		}
		s.close();
	}
	void print() {
		for(int i =num[0]; i>=num[1]; i--) {
			for(int j=num[2]; j>=num[3]; j--) {
				if((i*j)%num[4]==0) {
					System.out.print(num[4]+"의 배수");
					mul++;
				}
				else {
					System.out.print(" "+j+"*"+i+"="+i*j+" ");
				}
				if(j!=1) {
					System.out.print(",");
				}
				
			}
			System.out.println();
		}
		System.out.println(num[4]+"의 배수는"+mul+"개 입니다");
	}
	
	public static void main(String[] args) {
		Exam01 e = new Exam01();
		e.inputNums();
		e.print();
	}
}
