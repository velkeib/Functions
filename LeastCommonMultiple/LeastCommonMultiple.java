package LeastCommonMultiple;

public class LeastCommonMultiple{
	
	public static int leastCommonMultiple(int a, int b){
		
		int i = 1;
		int j = 1;
		int aMultiple = a;
		int bMultiple = b;
		
		while(aMultiple != bMultiple){
			if(aMultiple < bMultiple){
				i++;
				aMultiple = a * i;
				
			}else{
				j++;
				bMultiple = b * j;
			}	
		}
		
		return aMultiple;
		
	}
}


















