package p02;

public class Operator {
	
	/**
	 * @param args
	 */
	public static void main(String[]args) {
		
		int a=4;
		int b=a;
		int c=b;
		boolean b1=a==b;
		System.out.println(b1);
		System.out.println(a==b);
		
		if(a==b) {
			System.out.println("a와 b는 같습니다");
			
		}
		
		System.out.printf("%d, %d, %d \n",a,b,c);
		/*for(int i=0;i<10;i++) {
			if(a==b) {
				System.out.println((i+1)+".A와 B는 같습니다");
			}
		}
		for(int i=10;i>0;i--) {
			if(a==b) {
				System.out.println((i)+".A와 B는 같습니다");
			}
		}*/
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				if(a==b) {
					System.out.println((i)+".A와 B는 같습니다");
				}
			}
		}
		int len=7;
		String[] strArr=new String[len];
		for(int i=0;i<strArr.length;i++) {
			strArr[i]=(i+1)+"0";
		}
		for(int i=strArr.length-1;i>-1;i--) {
			System.out.println("strArr ["+i+"] = "+strArr[i]);
		}
		for(int i=95;i>0;i-=10) {
			System.out.println(i);
		}
	}
}
