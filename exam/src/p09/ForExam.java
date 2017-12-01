package p09;

public class ForExam {

	void initArr(int[][] nums) {
		int cnt =0;
		
		int addNum=1;
		for(int i=0; i<nums.length; i++) {
			if(i!=0) {
				addNum += nums[i-1].length;
			}
			for(int j =0; j< nums[i].length; j++) {
				nums[i][j]=j+addNum;
			}
		}
	}
	
	void printArr(int[][] nums) {
		for(int i=0; i<nums.length; i++) {
			for(int j =0; j< nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] nums = new int[3][];//이차원 배열은 각기 다른 사이즈를 가질 수 있다. 
									//대게 사이즈를 같게한다. 
		int[]a = new int[3];
		int[] b = new int[4];
		nums[0] = a;
		nums[1] = b;
		nums[2] = new int[5];
		
		ForExam fe= new ForExam();
		
		fe.initArr(nums);
		fe.printArr(nums);
		
	}
}
