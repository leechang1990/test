package p04;

import p03.ObjectExam;

public class LoopTest {
	
	public static void main(String[] args) {
		LoopTest loopTest= new LoopTest();
		ObjectExam oe= new ObjectExam();
		
		oe.inputNums();
		if(oe.num1>oe.num2) {
			oe.swap();
		}
		Function.printSum(oe.num1,oe.num2);
		Function.printEven(oe.num1,oe.num2);
		Function.printOdd(oe.num1,oe.num2);
		
	}
}
