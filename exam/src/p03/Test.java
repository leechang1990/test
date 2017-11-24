package p03;

public class Test {
	String str;//멤버변수는 파랑색
	
	Test(String str){ //생성자는 리턴타입이 없다. 
		this.str = str;
	}
	void print() {
		System.out.println(str);
	}
	
	static void printInt(int a) {
		System.out.println(a);
	}
	
	
	
	public static void main(String[] args) {
		ObjectExam oe =new ObjectExam();
		
		Test t = new Test("가나다abc123");
		//String str ="나 여나깄어요~~나";		
		t.print();
		//t.print(str.replace("나", "이창환"));//정말로 값을 바꿔주지는 않는다 일시적으로 바꾼값을 리턴
//		str = str.replace("나", "이창환");//값을 넣어주는 과정임 
		
		
//		System.out.println(str.indexOf("여"));//indexOf 메소드는 글자를 못찾으면 -1값을 반환한다.
//		System.out.println(str.lastIndexOf("여"));//뒤에서부터 검색 
//		System.out.println(str.substring(1));//시작값을 정해주게된다 0부터 시작이니 이가 잘린
		
//		try {
//			
//		}catch(Exception e) {
//			
//		}
		
	
	}
}
