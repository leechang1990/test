package p11;

import java.util.ArrayList;
import java.util.HashMap;

public class MapExam {

	public static void main(String[] args) {

		HashMap<String,String> hm = new HashMap<String,String>();
		ArrayList<HashMap<String,String>> alMap = new ArrayList<HashMap<String,String>>(); 
		
		hm.put("name","이창환");
		hm.put("name","창환");//name 키가 가지고있던 이창환 값을 창환으로 변경 
		hm.put("age", "이창환");
		for(int i=0; i<4; i++) {
			hm=new HashMap<String,String>();
			hm.put("age",i+"");
			alMap.add(hm);
		}
		for(HashMap<String,String> h: alMap) {
			System.out.println(h.get("age"));
		}
		
	}

}
