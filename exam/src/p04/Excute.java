package p04;

import p03.GuguDan;
import p03.ObjectExam;

public class Excute {
	

	public static void main(String[] args) {

		ObjectExam oe = new ObjectExam();
		oe.inputNums();
		GuguDan ggd = new GuguDan();
		ggd.printLoop(oe);
		
	}

}
