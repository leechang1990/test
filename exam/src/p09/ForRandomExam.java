package p09;

import java.util.Random;

public class ForRandomExam {

	void initTemp(int[] tempArr) {
		Random rd= new Random();
		for(int i=0; i<tempArr.length; i++) {
			tempArr[i]=rd.nextInt(20)+1;
			for(int j=i-1 ; j>=0; j--) {
				if(tempArr[i]==tempArr[j]) {
					i--;
				}
				
			}
			
		}
	}
	
	void downNums(int[] tempArr) {
		
		for(int i=0; i<tempArr.length; i++) {
			
			for(int j =i ; j<tempArr.length-1 ; j++) {
				
				if(tempArr[i]<tempArr[j+1]) {
					
					int temp=0;
					temp=tempArr[i];
					tempArr[i]=tempArr[j+1];
					tempArr[j+1]=temp;
					
				}
			}
		}
	}

	void finalInit(int[] tempArr,int[][] numsArr) {
		
		for(int i=0; i<tempArr.length; i++) {
			numsArr[i/numsArr.length]
					[i%numsArr.length]=tempArr[i];
		}
	}
	
	void print(int[][] numsArr) {
		for(int i=0; i<numsArr.length; i++) {
			for(int j=0; j<numsArr[i].length; j++) {
				System.out.print(numsArr[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	
	public static void main(String[] args) {
		
		int[][] numsArr = new int[3][3];
		int[] tempArr= new int[9];
		
		ForRandomExam fre = new ForRandomExam();
		
		fre.initTemp(tempArr);
		fre.downNums(tempArr);
		
		fre.finalInit(tempArr, numsArr);
		fre.print(numsArr);
		
	}
	
}
