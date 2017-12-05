package p11;

public class AddArray {
	int[] array = new int[0];
	
	
	public void add(int a) {
		
		int[] copyArray = array;
		array=new int[copyArray.length+1];
		
		if(copyArray.length==0) {
			
			array[0]=a;
			
		}else {
			for(int i=0; i<copyArray.length; i++) {
				
				array[i]=copyArray[i];
			
			}
			array[copyArray.length]=a;
		}
	}
	
	public int indexOf(int x) {
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		AddArray aa= new AddArray();
		aa.add(3);
		aa.add(2);
		
		for(int i=0; i<aa.array.length; i++) {
			System.out.println(aa.array[i]);
		}
		
		
	}
}
