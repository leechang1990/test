package p20;

import java.util.LinkedHashMap;

public class Excute {
	Service s= new Service();
	
	public int update(LinkedHashMap<String,Object> hm) {
		hm = new LinkedHashMap<String,Object>();
		hm.put("cidesc","네트워크보안반" );
		hm.put("cino","3");
		int result = s.updateClassInfo(hm);
		return result;
	}
	public int insert(LinkedHashMap<String,Object> hm) {
		hm = new LinkedHashMap<String,Object>();
		hm.put("cidesc","new" );
		hm.put("ciname","호호");
		int result = s.insertClassInfo(hm);
		return result;
	}
	public int delete(LinkedHashMap<String,Object> hm) {
		hm = new LinkedHashMap<String,Object>();
		hm.put("cino","8" );
		int result = s.deleteClassInfo(hm);
		return result;
	}
	public void select(LinkedHashMap<String,Object> hm) {
		hm = new LinkedHashMap<String,Object>();
		hm.put("cino","2");
		s.selectClassInfo(hm);
	}
	public static void main(String[] args) {
		LinkedHashMap<String,Object> hm = new LinkedHashMap<String,Object>();
		
		
	}
}
