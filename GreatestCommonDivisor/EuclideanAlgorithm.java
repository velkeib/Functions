package GreatestCommonDivisor;

public class EuclideanAlgorithm{
	
	public static int euclideanAlgorithm(int a, int b){
		
		if(a%b == 0){
            return b;
        }else{
            return euclideanAlgorithm( b, a % b);
        }
	}
	
}