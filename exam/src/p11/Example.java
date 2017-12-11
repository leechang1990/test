package p11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
	
public class Example {
	int minNum;
	int maxNum;
	 Example() {
		Scanner s= new Scanner(System.in);
		System.out.println("두개의 값을 입력해주세요");
		minNum = s.nextInt();
		maxNum = s.nextInt();
		
		if(minNum>maxNum) {
			int temp = minNum;
			minNum= maxNum;
			maxNum= temp;
		}
	}
	 
	 int initArrayList(ArrayList<Integer> al) {
		 Random r= new Random();
		 int temp;
		 int len=0;
		 for(int i=minNum; i<=minNum+(maxNum-minNum+1)/2; i++) {
			 temp=r.nextInt(maxNum-minNum+1)+minNum;
			 if(temp%2==0) {
				 al.add(temp);
				 len++;
			 }
			 else {
				 i--;
			 }
		 }
		 return len;
	 }
	 
	 void print(ArrayList<Integer> al) {
		 System.out.println(al);
	 }
	public static void main(String[] args) {
		Example ex = new Example();
		ArrayList<Integer> al= new ArrayList<Integer>();
		System.out.println(ex.minNum+" "+ex.maxNum);
		System.out.println(ex.initArrayList(al));
		ex.print(al);
		
	}
	
}
