package p16;

import java.util.ArrayList;


public class ArrayExam2 {
	
    public static void main(String[] args) {
    	ArrayExam ae = new ArrayExam();
    	ArrayList al = ae.getArrayList(1, 2);
       for(int i=0;i<10;i++){
    	   al.add(i);
       }
       System.out.println(al);
    }
}
