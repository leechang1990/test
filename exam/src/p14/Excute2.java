package p14;

import java.util.ArrayList;
import java.util.Random;

public class Excute2 {
	
	public static void main(String[] args) {
		MapExam2 me = new MapExam2();
		Random r = new Random();
		ArrayList<MapExam2> al = new ArrayList<MapExam2>();
		
		for(int i=0; i<10; i++) {
			
			me = new MapExam2();
			me.put("name"+i,"lee"+i);
			int age = r.nextInt(100)+1;
			me.put("age", age+"");
			al.add(me);
		}
		System.out.println(al);
	}
}
