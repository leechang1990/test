package p02;

import java.util.Scanner;

public class LoopExam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int minNum = scan.nextInt();
		int maxNum = scan.nextInt();
		int temp;
		if (maxNum < minNum) {
			temp = maxNum;
			maxNum = minNum;
			minNum = temp;
		}
		for (int i = minNum; i <= maxNum; i++) {
			System.out.println(i + "입니다");
		}
		System.out.println("minNum:" + minNum + "\nmaxNum:" + maxNum);
	}
}