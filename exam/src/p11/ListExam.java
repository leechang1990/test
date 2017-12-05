package p11;

import java.util.ArrayList;
import java.util.Random;

public class ListExam {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();//어레이 리스트는 배열 리스트를 의미한다
														//스트링만 들어갈 수 있는 배열 리스트
														//리스트의 장점 방갯수정하지 않아도됨 이득 
														//방갯수를 가변형으로 만들 수 있음 . 
		al.add(3);									//정해진 데이터 타입은 넣을 수 있음.
														//int는 Integer로 가능 그외도 가능 
		for(int i = 0; i<10 ; i++) {
			Random r = new Random();
			int n = r.nextInt(10)+1;
			
			if(al.indexOf(n)==-1) {
				al.add(n);
			}
			else {
				i--;
			}
		}
		for(Integer i:al) {
			System.out.println(i);
		}
		
		System.out.println(al.get(0));//중간의 있는 값을 사용할땐 느리다 , 
									//만힝 사용하는 이유는 순차적으로 입출력 하기 대문이다
		
	}
	
}
