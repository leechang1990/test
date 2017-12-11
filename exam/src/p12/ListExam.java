package p12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExam {

	private ArrayList<String> alStr = new ArrayList<String>();
	

	//처음 add했을때 처음 값을 추가 하셧 군요 메세지 
	//처음이 아니라면 전에 입력한 값을 출력 
	void add(String str) {
//		if(alStr.isEmpty()) {
//			System.out.println("처음 값을 추가 하셨군요");
//		}
//		else {
//			System.out.println(alStr.get(alStr.size()-1));//하나 전값을 출력해줌 
//		}
		alStr.add(str);
	}

	String get(int idx) {
		return alStr.get(idx);
	}
	void remove(int idx) {
		alStr.remove(idx);
	}
	void inputAlStr() {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자스트링을 넣어주세요. 구분자는 , 입니다.");
		
		String str = s.nextLine();
		str="";
		int sum =0;
		String[] strs = str.split(",");
		for(String ss:strs) {
			System.out.println(ss);
		}
		System.out.println(printAlStr2());
	}
	void printAlStr() {
		for(int i=0; i<alStr.size();i++) {
			
			if(Integer.parseInt(alStr.get(i).trim())%2==0) {
				remove(i);
			}
			else{
				
			}
			System.out.println(alStr.get(i)+" "+i+"번째 인덱스");
			
		}
	}
	int printAlStr2() {
		int sum=0;
		for(int i =0; i<alStr.size();i++) {
			String numStr = alStr.get(i);
			int num = Integer.parseInt(numStr);
			sum+= sum;
			System.out.println(i+"번째 값 "+numStr);
		}
		return sum;
	}
}
