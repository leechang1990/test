package p16;

public final class Exam2 {//final을 사용하면 상속이 되지 않음 함수에 사용하면 오버라이딩이 불가능 

	final int a=2;//선언과동시에 혹은 생성자 호출 다음에만 값을 넣어줄 수 있다. 
	Exam2(){
	}
	
	public static void main(String[] args) {
		System.out.println(new Exam2().a);
	}
}
