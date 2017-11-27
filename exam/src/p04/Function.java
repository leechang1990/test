package p04;

public class Function {
	static void printSum(int a,int b) {
		int sum =0;
		for(int i=a; i<=b; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	static void printEven(int a,int b) {
		int j=0;
		for(int i=a; i<=b; i++) {
			
			if(i%2==1) {
				System.out.print(i);
				System.out.printf("\t");
				j++;
			}
			if(j==10) {
				j=0;
				System.out.println();
			}
		}
		System.out.println();
	}
	
	
	static void printOdd(int a,int b) {
		int j=0;
		for(int i=a; i<=b; i++) {
			if(i%2==0) {
			System.out.print(i);
			System.out.printf("\t");
			j++;
			}
		
			if(j==10) {
				j=0;
				System.out.println();
			}
		}
		System.out.println();
	}
	
}//클래스
