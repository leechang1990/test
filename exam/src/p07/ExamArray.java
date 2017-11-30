package p07;

import java.util.Scanner;

public class ExamArray {

	void print(int[] a){
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
	}

	void plus(int[] a) {
		for(int i=a.length-1; i>0; i--) {
			for(int j = i-1 ;j>=0; j--) {
				if(a[i]<a[j]) {
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]= temp;
				}
			}
		}
	}
	
	void minus(int[] a){
		for(int i=0; i<a.length-1; i++) {
			
			for(int j =i+1; j<a.length; j++) {
			
				if(a[i]<a[j]) {
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]= temp;
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		int[] a= new int[5];
		a[0]= 10;
		a[1]= 11;
		a[2]= 4;
		a[3]= 7; 
		a[4]= 21;
		int inputNum;
		
		
		Scanner s = new Scanner(System.in);
		ExamArray ea= new ExamArray();
		System.out.println("오름차순은 1 내림차순은 0을 입력해주세요 ");
		
		inputNum = s.nextInt();
		if(inputNum==1) {
			ea.plus(a);
		}
		else if(inputNum==0) {
			ea.minus(a);
		}
		else {
			System.out.println("0이나 1이 아닙니다.");
		}
		ea.print(a);
		s.close();
	}
}
