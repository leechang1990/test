package p10;

public class Father {
	public int minNum;
	public int maxNum;
	
	public Father(int minNum,int maxNum) {
		this.minNum = minNum;
		this.maxNum = maxNum;
	}
	
	public void print() {
		for(int i=minNum; i<maxNum; i++) {
			if(i%10==0) {
				System.out.println(i);
			}
			else {
			System.out.print(i+",");
			}
		}
	}
	
	public String toString() {
		return "너냐? 날 부른게?";
	}
	
	protected void print(int a) {
		System.out.println(a);
	}
	
}
