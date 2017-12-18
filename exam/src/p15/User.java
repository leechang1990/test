package p15;

public class User {
	private String name;
	private int age;
	private int no;
	
	public User(int no) {
		this.no= no;
	}
	public User(String name, int age,int no) {
		this.name = name;
		this.age = age;
		this.no= no;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {// dto에서 만들어주는 것은 매너임 
		return "User [name=" + name + ", age=" + age + "]";
	}
}
