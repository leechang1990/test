package p08;

public class SortExam {

	public static void main(String[] args) {
		int[] nums = {1,2,2,3,3,4};
		String num = new String();
		int cnt =0;
		
		for(int j = 0; j<nums.length; j++) {
			
			for(int i = j+1; i<nums.length; i++) {
				
				if(nums[j] == nums[i]) {
					num +=nums[j]+" ";
				cnt++;
				}
			}
		}
		System.out.println("중복갯수는 "+cnt+"개 중복된 숫자는 "+num+"입니다");
	}
}
