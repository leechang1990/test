package p16;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam {
	int peoplenum =5;

	public ArrayList<String> sort(ArrayList<String> nums) {
		
		for(int i= 0; i<nums.size(); i++) {
			
			for(int j=i+1; j<nums.size(); j++) {
				int numi =Integer.parseInt(nums.get(i));
				int numj =Integer.parseInt(nums.get(j));
				if(numi>numj) {
					String temp;
					temp= nums.get(i);
					nums.set(i, nums.get(j));
					nums.set(j, temp);
				}
			}
		}
		return nums;
	}
	
	public ArrayList<String> init(ArrayList<String> nums){
		System.out.println(peoplenum+"명의 점수를 입력해주세요");
		Scanner s= new Scanner(System.in);
		for(int i=0; i<peoplenum; i++) {
			System.out.println(i+1+"번째");
			nums.add(s.nextLine().trim());
		}
		return nums;
	}
	public void sum(ArrayList<String> nums){
		int sum=0;
		for(String s:nums) {
			sum+=Integer.parseInt(s);
		}
		System.out.println(peoplenum+"명의 합은 "+sum);
	}
	public void avg(ArrayList<String> nums){
		int sum=0;
		for(String s:nums) {
			sum+=Integer.parseInt(s);
		}
		System.out.println(peoplenum+"명의 평균은 "+sum/peoplenum);
	}
	
	public static void main(String[] args) {
		Exam ex= new Exam();
		ArrayList<String> nums = new ArrayList<String>();
		nums=ex.init(nums);
		nums=ex.sort(nums);
		System.out.println(nums);
		ex.sum(nums);
		ex.avg(nums);
	}
}
