package ch;


public class Exam {
  
   static void input(int[] door) {
      for(int i=0; i<door.length; i++) {
      door[i]=0;//사용된 배열을 초기화
      }
      int j =(int)(Math.random()*1000000000%(door.length));
      door[j]=1;// 1/3확률로 1(포르쉐)을 넣어줌
   }//input
   
   
   
   static int output(int[] door) {
      int output = 0;
      int selectDoor = 0;
      selectDoor=(int)(Math.random()*1000000000%(door.length));//랜덤으로 문을선택함
      
      for(int i=0; i<door.length ; i++) {//문번호를 0부터 3까지 바꾸기 위해 선택 
    	  if(selectDoor==i) {//내가 선택한 문 번호가 i
    		  if(door[i]==0) {//내가 선택한 문뒤에 양이 있다는 가정을 제외하곤 모두 포르쉐이니 
    			  output=1;//아웃풋에 1을 대입해줌 
    		  }
    	  } 
      }
      return output;
   }//output
   
   
   public static void main(String[] args) {
      int[] door = new int[3];
      int porsche=0;
   
      for(int i=0; i<10000; i++) {
         input(door);//배열 초기화and 포르쉐1 값 넣음 함수
         if(1==output(door)) {
            porsche++;
         }
      }
      System.out.println(porsche);
   }
}//결국 내가 처음에 선택한 문(33%)에 없으면 무조건 타가는 거 (66%)  