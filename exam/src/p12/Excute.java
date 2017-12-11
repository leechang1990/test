package p12;

public class Excute {


	public static void main(String[] args) {
	
		ListExam le = new ListExam();
		
		
		for(int i =0; i<10; i++) {
			le.add(i+"");
		}
		
		le.printAlStr();
		le.inputAlStr();
	}
}
