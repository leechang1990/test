package p11;

import java.util.ArrayList;

public class StringList extends ArrayList{
	
//	public String toString() {
//		return "난 내가 뭘 찍어야 할지 모르겠다";
//	}
	  public boolean add(String e) {
	        
	        return super.add("0");
	        
	    }
	public static void main(String[] args) {
		
		ArrayList sl = new StringList();
		sl.add("asdf");
		System.out.println(sl);
		
	}
}
