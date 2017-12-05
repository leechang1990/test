package p11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	int lottoCnt = 0;
	int joinCnt =0;
	
	Lotto(){
		Scanner s = new Scanner(System.in);
		System.out.println("참여인원을 선택해주세요");
		joinCnt = s.nextInt();
		System.out.println("당첨인원을 선택해주세요");
		lottoCnt = s.nextInt();
		s.close();
	}
	
	void setLottos(ArrayList<Integer> lottos) {
		Random r = new Random();
		
		for(int i = 0; i<lottoCnt ; i++) {
			
			int n = r.nextInt(joinCnt)+1;
			
			if(lottos.indexOf(n)==-1) {
				lottos.add(n);
			}
			else {
				i--;
			}
		}
		
	}
	public void print(ArrayList<Integer> lottos) {
		System.out.println("당첨인원 :"+lottoCnt);
		System.out.println("비당첨인원 :"+(joinCnt-lottoCnt));
		
		setLottos(lottos);
		System.out.print("당첨사람 번호 :");
		
		
		for(Integer i:lottos) {	
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> lottos = new ArrayList<Integer>();
		
		Lotto l = new Lotto();
		
		l.print(lottos);
		
	}
}
