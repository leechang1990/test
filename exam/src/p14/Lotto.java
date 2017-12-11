package p14;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	Scanner s = new Scanner(System.in);
	
	public int[] auto() {
		int[] nums= new int[6];
		Random r = new Random();
		for(int i=0; i<6; i++) {
			nums[i]=r.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(nums[i]==nums[j]) {
					i--;
				}
			}
		}
		return nums;
	}
	public int[] half() {
		int[] nums= new int[6];
		int inputNums ;
		Random r = new Random();
		System.out.println("반자동으로 선택할 숫자의 갯수를 입력해주세요 1~5");
		inputNums= s.nextInt();
		for(int i=0; i<inputNums; i++) {
			System.out.println("숫자를 입력해주세요");
			nums[i]=r.nextInt(45)+1;
		}
		for(int i=inputNums; i<6; i++) {
			nums[i]=r.nextInt(45)+1;
			for(int j=0; j<6; j++) {
				if(nums[i]==nums[j]) {
					i--;
				}
			}
		}return nums;	
	}
	public int[] active() {
		int[] nums= new int[6];
		return nums;
	}
	public static void main(String[] args) {
		
		Lotto lo = new Lotto();
		String game;
		System.out.println("게임 형태를 입력해주세요(자동, 반자동, 수동)");
		game=lo.s.nextLine().trim();		
		if(game.equals("자동")) {
			
		}else if(game.equals("반자동")) {
			
		}else if(game.equals("수동")) {
			
		}else {
			System.out.println("잘못입력하셨습니다");
		}
		
	}
}

