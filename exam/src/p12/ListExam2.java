package p12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ListExam2 {
	//String으로 구성된 ArrayList를 선언해주세요.
	//스케너 클래스를 사용하여 숫자를 입력받아 
	//해당숫자 만큼 반복해서 ArrayList의 값을 
	//스ㅐ너 변수로 문자열숫자를 입력받아주세요 
	//중복값제거 
	//만약 중복값을 입력할 경우 중복값이 있다고 알려주고 
	//다시 돌아가야 합ㄴ다. 
	//ArrayList안에 값을 출력하는 함수를 2개 만들어주시고 
	//첫번째 함수는 짝수일때만 
	//두번재 함수는 홀수일때만 출력해주세요 

	ArrayList<String> al = new ArrayList<String>(); 
	Scanner s = new Scanner(System.in);
	Random r = new Random();
	
	void init() {
		String temp;
		System.out.println("숫자를 입력해주세요 ");
		int num=s.nextInt();
		
		for(int i=0; i<num; i++) {
			
			temp=r.nextInt(num*2)+1+"";
			
			for(int j=i-1 ; j > 0 ; j-- ){
				if(temp.equals(al.get(j))) {
					i--;
				}else {
					al.add(temp);
				}
			}
			
		}
	}
	void printEven() {
		for(String s:al) {
			if(Integer.parseInt(s)%2==0) {
				System.out.print(s+" ");
			}
			
		}
		System.out.println();
	}
	void printOdd() {
		for(String s:al) {
			if(Integer.parseInt(s)%2==1) {
				System.out.print(s+" ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		ListExam2 le= new ListExam2();
		
		le.init();
		System.out.println(le.al);
		le.printEven();
		le.printOdd();
	}
	
}
