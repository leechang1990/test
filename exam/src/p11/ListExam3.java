package p11;

import java.util.ArrayList;
import java.util.Random;

public class ListExam3 {
	int maxNum=100;
	Random r= new Random();
	int len=20;
	
	int sum(ArrayList<Integer>  alInt) {
		int sum=0;
		for(Integer i: alInt) {
			sum+=i;
		}
		return sum;
	}
	void init(ArrayList<Integer>  alInt) {
		for(int i=0; i<len; i++ ) {
			alInt.add(r.nextInt(maxNum)+1);
		}
	}
	
	
	public static void main(String[] args) {
	
		ArrayList<Integer> alInt = new ArrayList<Integer>();
		ListExam3 le=new ListExam3();
		
		le.init(alInt);
		System.out.println(le.sum(alInt));
		
	}
	
}
