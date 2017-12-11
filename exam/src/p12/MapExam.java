package p12;

import java.util.HashMap;
import java.util.Random;

public class MapExam {
	HashMap<Integer,String> hm = new HashMap<Integer,String> ();
	
	void add(String str) {
		hm.put(hm.size(), str);
	}
	boolean add(int idx) {
		
		if(hm.get(idx)==null) {//인덱스의 벨류값이 널이라면 값을 넣고 
			hm.put(idx, hm.size()+1 + "번째값");
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		MapExam me =new MapExam();
		Random r = new Random();
		for(int i=0; i<10; i++) {
			if(me.add(r.nextInt(10))) //값을 새로 넣어주지 않았다면 i-- 실행
			{
				--i;
			}
		}
		System.out.println(me.hm);
	}

}
