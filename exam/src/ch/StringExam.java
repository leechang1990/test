package ch;



class StringExam { 
	  public static String getAnswer(String[] strArr) { 
          
		  return strArr[(int)Math.random()%strArr.length];
     } 
     
//     public static String getScrambledWord(String str) { 
//        char[] ch = new char[str.length()];
//    	ch = str.toCharArray();  
//    	for(int i=0; i<ch.length; i++) {
//    		
//    	  }
//    	 return ;
//     } // scramble(String str) 
	
      public static void main(String[] args) { 
            String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 

            String answer = getAnswer(strArr); 
       //     String question = getScrambledWord(answer); 

          //  System.out.println("Question:"+question); 
            System.out.println("Answer:"+answer); 
      } // main 

    
} 

