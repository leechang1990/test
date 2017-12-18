package p16;

public class Excute {
	
	public void printAction(Action act) {
		act.eat();
		act.sleep();
		act.walk();
	}

	public static void main(String[] args) {
		Action Hong  = new Hong("Hong",20,183,"hong@naver.com");
		Excute e = new Excute();
		e.printAction(Hong);
		Cat c = new Cat("야옹이",4,40);
		e.printAction(c);
	}
}
