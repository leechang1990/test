package p14;

import java.util.ArrayList;

public class MapExam2 {

	private ArrayList<String> alKey;
	private ArrayList<String> alValue;
	
	
	public MapExam2() {
		alKey = new ArrayList<String>();
		alValue = new ArrayList<String>();
		
		
	}
	
	public void put(String key,String value) {
		int idx = alKey.indexOf(key);//들어온 키의 인덱스 값
		
		if(idx!=-1) {//있냐 없냐를 의미한다 
			alKey.remove(idx);
			alValue.remove(idx);
			
		}
		alKey.add(key);
		alValue.add(value);
		
		
	}
	
	public String get(String key) {
		
		int idx = alKey.indexOf(key);
		if(idx==-1) {
			return null;
		}
		return alValue.get(idx);
	}
	public int size() {
		return alKey.size();
	}
	public boolean remove(String key) {
		int idx = alKey.indexOf(key);
		if(idx==-1) {
			return false;
		}else {
			alKey.remove(idx);
			alValue.remove(idx);
			
		}
		return true;
	}
	@Override
	public String toString() {
		
		String str="{";
		for(int i=0; i<alKey.size(); i++) {
			str+="["+alKey.get(i)+ " "+alValue.get(i)+"]"+"";
		}
		return str+"}";
	}
}
