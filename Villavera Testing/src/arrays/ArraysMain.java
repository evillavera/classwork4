package arrays;

import java.util.Arrays;

public class ArraysMain {

	private String[] testArray;
	private int[] intRay;
	
	
	public ArraysMain() {
		intRay = new int[1000];
//		populate(intRay);
//		checkOccurences(intRay,3,18);
		populate1ToN(intRay);
		shuffle(intRay);
		System.out.println(Arrays.toString(intRay));
	}
	
	private void shuffle(int[] arr) {
		for(int i = 0; i < arr.length;i++) {
			swap(arr, (int)(Math.random()*arr.length), (int)(Math.random()*arr.length));
		}
	}

	private void swap(int[] arr, int i, int j) {
		int placeholder = arr[i];
		arr[i] = arr[j];
		arr[j] = placeholder;
		
	}

	private void populate1ToN(int[] arr) {
		for(int i = 0; i < arr.length;i++) {
			arr[i] = i+1;
		}
	}

	private void checkOccurences(int[] arr, int start, int end) {
		int[] counter = new int[end-start+1];
		for(int value: arr) {
			counter[value-start]++;
		}
		for(int i = 0; i < counter.length;i++) {
			System.out.println("A "+(start+i)+" was rolled "+counter[i]+" times.");
		}
	}
	
	
	public void populate(int[] intRay) {
		for(int i = 0; i < intRay.length;i++) {
			intRay[i] = diceRoll(3);
		}	
	}
	
	public void notes() {
		//1.collection of primitives or objects
		//SPECIAL NOTE: This is the ONLY collection of primitives
		
		//2.size cannot be modified
		
		/*3. Elements of an array are REFERENCES to objects.
		* In other words, changing an element of an array changes.
		* the REFERENCE, not the object(more on this later)
		*/
		
		//________________________________________________________________
		
		//There are two types of constructors, the first we've seen already:
		int[] firstType = {3,14,-9,10};
		//This constructor can only be used at the declaration. Error:
		//firstType = {12,13,14,15};
		
		//the 2nd type:
		testArray = new String[50];
		/*SPECIAL NOTE: for primitive arrays, when they are instantiated,
		*they are automatically populated with 0s. This is not the case with
		*Object arrays, which are populated with 'null'
		*/
		
		//standard 'for' loop
		for(int i = 0; i < testArray.length;i++) {
			System.out.println("The #" + i + " item is:" + testArray[i]);
		}
		
		//for each loop (useful only when you don't need to keep track of an index)
		for(String value:testArray) {
			//"for each int in testArray..."
			System.out.println(value);
		}
	}

	public static void main(String[] args) {
		ArraysMain arrayPractice = new ArraysMain();
		
	}
	
	/**
	 * Returns the result from rolling "numberOfDice" dice.
	 * @param numberOfDice
	 * @return
	 */
	
	public int diceRoll(int numberOfDice) {
		int output = 0;
		for(int i = 0; i < numberOfDice; i++) {
			//int randomNumber = (int) Math.floor((Math.random()*6 + 1));
			output = output + 1+(int)(Math.random()*6);
			//utput += randomNumber;
		}
		return output;
	}
}
