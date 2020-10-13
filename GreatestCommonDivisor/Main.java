package GreatestCommonDivisor;

import GreatestCommonDivisor.GreatestCommonDivisor;
import GreatestCommonDivisor.EuclideanAlgorithm;

class Main{
	public static void main(String[] args){
		
		System.out.println("" + GreatestCommonDivisor.greatestCommonDivisorBruteForce(10500, 3000));
		
		System.out.println("" + EuclideanAlgorithm.euclideanAlgorithm(10500, 3000));
		
	}
}