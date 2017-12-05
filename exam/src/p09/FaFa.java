package p09;

public class FaFa {
	
	protected int a= 3;
	
//	public FaFa() {
//		System.out.println("파파호출 ");
//	}
	
	 FaFa(String str) {
		System.out.println("아바 생성자 호출 : "+str);
	}
	public FaFa(String str,String str2) {
		System.out.println("아바 생성자 호출 : "+str + str2);
	}
	
	public void print() {
	 System.out.println("내가니 애비다");	
	}
	
	protected void print(String str) {
		System.out.println(str);
	}
	
}
