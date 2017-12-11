package p13;

import java.util.LinkedHashMap;
import java.util.Random;

public class MapExam {
   LinkedHashMap<Integer,Integer> hm= new LinkedHashMap<Integer,Integer>();
   
   public int miniNum(int num) {
      int cnt=0;
      for(int i =1; i<num; i++) {
         if(num%i==0) {
            cnt++;
         }
      }
      return cnt;
   }
   public int[] initArray() {
      int[] arrNums = new int[20];
      for(int i =0; i<arrNums.length; i++) {
         arrNums[i]=new Random().nextInt(1000)+1;
         for(int j= 0; j<i; j++) {
            if(arrNums[i]==arrNums[j]) {
               i--;
            }
         }
      }
      return arrNums;
   }
   public void sortLinkedHashMap() {
      int temp;
      
      for(int i = 0; i<hm.size(); i++) {
         for(int j =i+1; j<hm.size(); j++) {
            if(hm.get(i)<hm.get(j)) {
               
            	
            	
            }
         }
      }
   }
   public void findMiniNums(int[] arrNums) {
      for(int num: arrNums) {
         hm.put(num, miniNum(num));
      }
   }
   public static void main(String[] args) {
	  MapExam ex = new MapExam();
      int[] arrNums=ex.initArray();
      ex.findMiniNums(arrNums);
      
   }   
}