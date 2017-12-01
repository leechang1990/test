package p09;

public class OverLoadingExam {

	public int getInt() {
		return 1;		
	}
	
	public void getInt(int a) {

	}
	
	public static void main(String[] args) {
		
		OverLoadingExam ole = new OverLoadingExam();
		
		int a = ole.getInt();
		System.out.println();
	}

}
