package p08;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	private int[] lottoNums;
	private int lottoMaxNum;
	private int checkRandomNum;
	private int[] checkLottoNums;
	
	
	public Lotto(int lottoNumslength,int lottoMaxNum) {
		this.lottoNums= new int[lottoNumslength];
		this.lottoMaxNum =lottoMaxNum;
	}
	public Lotto() {
		this(6);
	}
	public Lotto(int lottoNumslength) {
		this(lottoNumslength,45);
	}
	
	void makeLotto() {
		
		Random r = new Random();
		
		for(int i=0; i<lottoNums.length; i++) {
			checkRandomNum = r.nextInt(lottoMaxNum)+1;
			if(isDupl()) {
			
				i--;
			}
			else {
				lottoNums[i]=checkRandomNum;
			}
		}
	}
	
	void setCheckLottoNums(int[] checkLottoNums) {
		this.checkLottoNums = checkLottoNums;
	}
	
	private boolean isDupl() {
		for(int i =0; i<lottoNums.length; i++) {
			if(lottoNums[i]==checkRandomNum) {
				return true;
			}
		}
		return false;
	}
	
	
	void printNum() {
		for(int i=0; i<lottoNums.length; i++) {
			System.out.println(lottoNums[i]);
		}
	}
	void machLottoNum() {
		int cnt=0;
		System.out.println("맞는 숫자는:");
		for(int i =0; i<lottoNums.length; i++) {
			for(int j=0; j<checkLottoNums.length; j++) {
				if(lottoNums[i]==checkLottoNums[j]) {
					System.out.print(checkLottoNums[i]+" ");
					cnt++;
				}
				
			}
		}
		System.out.print("이며 ");
		System.out.println("총"+cnt+"개 입니다");
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Lotto lt = new Lotto(3,10);	
		lt.makeLotto();
		lt.printNum();
		
		int[] nums = {2,4,5};
		lt.setCheckLottoNums(nums);
		lt.machLottoNum();
	}
}
