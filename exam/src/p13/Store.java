package p13;

import java.util.HashMap;

public class Store {
	HashMap<String,Integer> hm = new HashMap<String,Integer>();
	
	void setHashMap() {
		hm.put("크레파스", 11400);
		hm.put("가위", 2700);
		hm.put("스케치북", 1200);
		hm.put("풀", 800);
		hm.put("도화지", 200);
	}
	
	
	public static void main(String[] args) {
		Store s= new Store();
		
		
	}
	
}
