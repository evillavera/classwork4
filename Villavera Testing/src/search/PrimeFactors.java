package search;

public class PrimeFactors {
	private static int number = 0;
	
	 public static void main(String[] args){
		 int value = 30;
		 int value2 = 18;
		 String word = "hello";
		 /*
		 System.out.println(value+"! is equal to "+factorial(value));
		 System.out.println(value+ " has "+countPrimeFactors(value, 2)+" prime factors.");
		 */
		 System.out.println(word+"! is equal to "+recursiveMethod(word));
		// System.out.println(mystery(value,value2));
		 }
/*
		 public static int countPrimeFactors(int value, int testPrime) {
		 if(value == 1) {
			 System.out.println("The number " + testPrime + " has been tested "
						+ number + " times. " + value + " was the last factor.");
			 number++;
			 return 1;
		 }else if(value%testPrime != 0){
			return countPrimeFactors(value/testPrime,testPrime+1);
		 }else {
			number++;
			return countPrimeFactors(value/testPrime,testPrime);
		 }
		 }
*/
		 public static int factorial(int value) {
		 if(value == 1) {
			 return 1;
		 }else {
			 return value*factorial(value-1);
		 }
		 }

		 
		 public static String recursiveMethod(String input) {
			 if(input.length() == 1) {
				 return input;
			 }else {
				 return input.substring(input.length() - 1, input.length()) + 
						 recursiveMethod(input.substring(0, input.length() -1));
			 }
		 }
		 
		 /**
		  * Sam's Code
		  *  public static int countPrimeFactors(int value, int testPrime) {
		 if(value == 1) {
			 return 0;
		 }else if(value%testPrime == 0){
			return countPrimeFactors(value/testPrime,testPrime) + 1;
		 }else {
			number++;
			return countPrimeFactors(value,testPrime);
		 }
		 }
		  */
}
