package p10;

public class Excute extends Father{//상속하면 자동 생성자 생성 단, 기본생성자만 있는경우가능 
//	
	
//	Excute(){//아빠 호출 
//		a=4;
//		System.out.println("아들 호출 ");
//	}
	
	//int a = 4;
	
	 Excute(int minNum, int maxNum) {
		super(minNum, maxNum);
	
	}
	 
	 public void print() {
			for(int i=minNum; i<=maxNum; i++) {
				
				if( ((i%10)%3==0 && (i%10)!=0)//1의 자리가 3의 배수이면서 10으로 나눈값이 0이 아니면 
						&& 
						((i/10)%3)==0 && (i>10)) {//10의 자리가 3의 배수이면서 10이하가 아니면 
					System.out.print("짝짝 ");
				}
				else if( ((i%10)%3==0 && (i%10)!=0)//1의 자리가 3의 배수이면서 10으로 나눈값이 0이 아니면 짝
						|| 
						((i/10)%3)==0 && (i>10)) {//10의 자리가 3의 배수이면서 10이하가 아니면 짝 
					System.out.print("짝 ");
				}
				else {
					System.out.print(i+" ");
				}
				if(i%10==0) {
					System.out.println();
				}
			}
		}
	
	 public void print(Father f) {
		 System.out.println(f.toString());
	 }
	 
	public static void main(String[] args) {
		//오늘배운 접근제어자 중 public , protected, default를 사용하여 
		//함수 또는 생성자를 만들어 주세요 
		//상속을 사용하여 오버라이딩을 해보고 
		//각각 어디서 호출 되는지 테스트 해보기 바랍니다. 
		//FaFa f = new FaFa();
		//오버라이딩이 만족하기 위한 두가지 조건 하나는 상속 나머지 두가지 
		//아버지랑 아들이랑 함수이름이 같아야함.
		
		
		
		Father f;
		
		f= new Father(1,2);
		Excute e = new Excute(1,2);
		e.print(f);
	}
	
	
}
