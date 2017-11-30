package p08;

public class Exam {

	public static void main(String[] args) {
		
		int[] nums1  = {1,2,3};
		int[] nums2  = {2,3,4};
		
		int cnt =0;
		for(int i=0; i<nums1.length; i++) {
			for(int j=0; j<nums2.length; j++) {
				if(nums1[i]==nums2[j]) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
