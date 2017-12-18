package p15;

import java.util.ArrayList;

public class Excute {

	public static void  main(String[] args) {
		Controller c = new Controller();
		
		
		for(int i=1; i<=5; i++) {
			User user = new User("이름"+ i ,i,i);
			c.get("add",user);
		}
		
		ArrayList<User> userList = c.get("list", null) ;
		for(User s: userList) {
			System.out.println(s);
		}
		User ru= new User(3);
		c.get("remove", ru);
		for(User s: userList) {
			System.out.println(s);
		}
		ru.setName("이름1");
		userList =c.get("search", ru);
		
		System.out.println("검색결과");
		
		for(User user:userList) {
			System.out.println(user);
		}
		User user = new User("모모",20,2);
		c.get("update", user);
		for(User u: userList) {
			System.out.println(u);
		}
	}
}
