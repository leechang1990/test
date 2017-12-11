package p11;

import java.util.HashMap;
import java.util.Scanner;

public class HashLoginExam {
	HashMap<String,String> hm = new HashMap<String,String>();
	
	public void login() {
		String pw;
		Scanner s = new Scanner(System.in);
		
		for(int i=0;;i++) {
			System.out.println("로그인할 아이디를 입력해주세요");
			pw=hm.get(s.nextLine().trim());
			System.out.println("패스워드를 입력해주세요");
			
			if(pw.equals(s.nextLine().trim())) {
				System.out.println("로그인 되었습니다");
				s.close();
				return ;
			}
			else {
				System.out.println("아이디나 패스워드가 일치하지 않습니다.");
				if(i>5) {
					System.out.println("아이디와 비밀번호를 5회이상 틀려 로그인이 불가능 합니다.");
					return ;
				}
			}
		}
		
	}
}
