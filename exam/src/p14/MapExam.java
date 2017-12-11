package p14;

import java.util.ArrayList;
import java.util.HashMap;

public class MapExam<K,V> extends HashMap<K,V>{
	ArrayList<K> al = new ArrayList<K>(); 
	MapExam(){
	}
	@Override//오버라이드를 할때만 사용가능 임
	public V put(K key, V value) {
		
		if(al.indexOf(key)==-1) {
			al.add( key);
		}
		return super.put(key, value);
	}
	@Override
	public V remove(Object key) {
		
		int idx = al.indexOf(key);
		al.remove(idx);
		return super.remove(key);
		
	}
	
	@Override
	public String toString() {
		String str="{";
		for(K k: al) {
			str += k+"=" +this.get(k)+";";
		}
		return ""+str+"}";
		
	}
	
}
