package p11;

import java.util.Random;
import java.util.Scanner;

public class LottoExam {
	int lottoCnt = 0;
	int joinCnt =0;
	
	LottoExam(){
		Scanner s = new Scanner(System.in);
		System.out.println("참여인원을 선택해주세요");
		joinCnt = s.nextInt();
		System.out.println("당첨인원을 선택해주세요");
		lottoCnt = s.nextInt();
		s.close();
	}
	
	void joinSelect(int[] join) {
		
		for(int i=0; i<join.length; i++) {
			Random r=new Random();
			join[i]=r.nextInt(join.length*2)+1;
			for(int j=0; j<i; j++) {
				if(join[i]==join[j]) {
					i--;
				}
			}
		}
	}
	void winnerSelect(int[] join,int[] lotto) {
		
		for(int i=0; i<lotto.length; i++) {
			Random r=new Random();
			lotto[i]=r.nextInt(join.length*2)+1;
			
			if( none(lotto[i],join) || isdupl(i,lotto,lotto[i])) {
				i--;	
			}
			
		}
	}
	boolean isdupl(int index,int[] lotto,int lottonums) {
		for(int i=0; i<index; i++) {
			
			if(lottonums==lotto[i]) {
				return true;
			}
		}
		
		return false;
	}
	
	boolean none(int lotto, int[] join) {
		for(int i=0; i<join.length; i++) {
			if(lotto==join[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		LottoExam le= new LottoExam();
		int[] join= new int[le.joinCnt];
		int[] lotto= new int[le.lottoCnt];
		
		le.joinSelect(join);
		le.winnerSelect(join, lotto);
		for(int i=0; i<join.length; i++) {
			System.out.print(join[i]+" ");
		}
		System.out.println();
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
		
	}
	
}
