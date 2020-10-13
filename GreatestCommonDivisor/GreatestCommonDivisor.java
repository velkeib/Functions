package GreatestCommonDivisor;

public class GreatestCommonDivisor{
	
	public static int greatestCommonDivisorBruteForce(int a, int b){
		
		if(b < a){
			int temporary = a;
			a = b;
			b = temporary;
		}
		
		int greatest = 1; 
		
		for(int i = 2; i < a; i++){
			if(a % i == 0 && b % i == 0){
				greatest = i;
			}
		}
		
		return greatest;
		
	}
	
}