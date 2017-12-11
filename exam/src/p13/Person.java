package p13;

public class Person {

	
	private String name;
	private int age;
	
	public void setAge(int age) {//은닉화
		this.age = age;
	}
	public int getAge() {//캡슐화
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String toString() {//toString 메소드에 대해 공부 
		return "이름은 :"+name+ "나이는:"+age;
		
	}
	
	
}
