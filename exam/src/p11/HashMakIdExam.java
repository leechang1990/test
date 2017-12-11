package p11;

import java.util.Scanner;

public class HashMakIdExam extends HashLoginExam{
	
	
	public void makeId() {
		String id,pw;
		Scanner s = new Scanner(System.in);
		System.out.println("만들어줄 아이디를 입력해주세요");
		id=s.nextLine().trim();
		System.out.println("패스워드를 입력해주세요");
		pw=s.nextLine().trim();
		hm.put(id, pw);
		
	}

	public static void main(String[] args) {
		
		
		HashMakIdExam mkid = new HashMakIdExam();
		mkid.makeId();
		mkid.login();
		
		
	}
	
}
