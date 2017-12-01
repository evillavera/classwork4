package search;

public class PrimeFactors {
	private static int number = 0;
	
	 public static void main(String[] args){
		 int value = 18;
		 System.out.println(value+"! is equal to "+factorial(value));
		 System.out.println(value+ " has "+countPrimeFactors(value, 2)+" prime factors.");
		 }

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

		 public static int factorial(int value) {
		 if(value == 1) {
			 return 1;
		 }else {
			 return value*factorial(value-1);
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
