package PrimeFactor;

import java.util.*;

public class PrimeFactor{
	
	public static List<Integer> primeFactor(int a){
		
		ArrayList<Integer> factors = new ArrayList<Integer>();
		
		while(a != 1){	
			factors.add(leastPrimeDivisor(a));
			a = a / leastPrimeDivisor(a);
		}
		
		return factors;
	} 
	
	public static int leastPrimeDivisor(int a){
		
		for(int i = 2; i <= a; i++){
			if(isPrime(i) && a % i == 0){
				return i;
			}
		}
		return a;
	}
	
	public static boolean isPrime(int a){
		
		int i = 2;
		boolean isPrime = true;
		
		while(i < a && isPrime){
			if(a % i == 0){
				isPrime = false;
			}
			i++;
		}
		
		return isPrime;
	}
	
}