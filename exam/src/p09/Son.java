package p09;

public class Son extends FaFa{
	
	public Son() {
		super("abc");
	}
	public void print() {// FaFa의 클래스에도 있지만 재정의(오버라이딩) 
						//오버라이딩의 충족 조건 무조건 상속 함수명 같아야 하며  
						//파라메터의 데이터 타입 같아야함
		System.out.println("son");
	}
	
	protected void print(String str) {//저으이 하지 않았기 때문에 디폴트 함수 
		System.out.println(str);
	}
	
	void print(String str, String str2) {
		System.out.println(str+","+str2);
	}
	
	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s.a);
		s.print();
	}
}
