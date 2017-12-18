package p15;

import java.util.ArrayList;

public class Controller {//MVC패턴 

	private Service service;
	
	public 	Controller() {
		service = new Service();//콘트롤러를 호출하면 서비스를 호출 
	}
	
	public ArrayList<User> get(String command,User user) {
		
		if(command.equals("list")) {
			return getUserList(null);
		}else if(command.equals("add")) {
			boolean isOk = insertUser(user);
			if(isOk) {
				System.out.println(user.getName()+"입력완료!");
			}else {
				System.out.println("입력중에 알 수 없는 에러가 발생하였습니다. ");
			}
		}else if(command.equals("remove")) {
			
			boolean isOk = removeUser(user);
			if(isOk) {
				System.out.println(user.getName()+"삭제 완료!");
			}else {
				System.out.println("삭제 중 알 수 없는 에러가 발생하였습니다. ");
			}
		}else if(command.equals("search")) {
			return getUserList(user.getName());
			
		}else if(command.equals("update")) {
			boolean isOk = removeUser(user);
			if(isOk) {
				System.out.println(user.getName()+"삭제 완료!");
			}else {
				System.out.println("업데이트 중 알 수 없는 에러가 발생하였습니다. ");
			}
		}
		return null;
	}
	public boolean insertUser(User user){
		return service.insertUser(user);
	}
	public boolean removeUser(User user) {
		return service.removeUser(user);
	}
	public ArrayList<User> getUserList(String str){
		return service.getUserList(str);
	}
	public boolean updateUser(User user) {
		return service.updateUser(user);
	}
}
