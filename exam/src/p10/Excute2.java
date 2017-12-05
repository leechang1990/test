package p10;

public class Excute2 {
	
	//p3 클래스 생성 피2 상송받아 주시고 
	//ㅔ4 클래스 생서 p3 상속받아주세요 
		// tostring함수 모두다 선언 
	//각각의 클래스들을 모두다 object 데이터로 선언 빛 생성자 호출
	//오브젝트 배열에 넣어주세요 
	//반복문사용해서 오브젝트 배열에있는 변수를 풀력해주시기 바랍니다. 
	public static void main(String[] args) {
		
		Object p1 = new Person();
		Object p2 = new p2();
		Object p3 = new p3();
		Object p4 = new p4();
		
		Object[] ob= new Object[4];
		ob[0] = p1;
		ob[1] = p2;	
		ob[2] = p3;
		ob[3] = p4;
		
		for(int i =0; i<ob.length; i++) {
			System.out.println(ob[i]);
		}
		
		//System.out.println(p1.toString());
//		System.out.println(p2.toString());
		
		
	}
}
