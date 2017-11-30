package p07;

public class Exam02 {

	public static void main(String[] args) {
	
		int water = 107;
		int pet5 = 5;
		int pet3 = 3;
		int pet2 = 2;
		int usePet5=0;
		int usePet3=0;
		int usePet2=0;
		
		for( ; water>=pet5; usePet5 ++) {
			water= water- pet5;
		}
		for(; water>=pet3; usePet3 ++) {
			water= water- pet3;
		}
		for(; water>=pet2;usePet2 ++ ) {
			water= water- pet2;
		}
		System.out.println("5리터 물병 "+usePet5+"번 사용"+"3리터 물병 "+ usePet3+"번사용"
		+"2리터 물병 "+usePet2+"번 사용하셨으며 총 "+(usePet5+usePet3+usePet2)+"번 사용하셨습니다.");
	}
}

/*
 * 총 107리터의 물이 있습니다. 
 * 5리터의 물통 과 3리터의 물통 2리터의 물통을 가지고있을때 
 * 총 몇개의 물통이 있어야 107리터를 담을 수있 는지 
 * 개산하는 프로그램을 작성해주세요.
 */
