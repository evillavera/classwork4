package arrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args){
		//ObjectArrays oA = new ObjectArrays();
		Person s = new Person("Erik","Villavera", Borough.NY_BOROUGHS[0]);
		int x = 10;
		int[] a = {5,6,7};
		test1(s,x,a);
		System.out.println(s+", "+x+", "+Arrays.toString(a));
	}
	
	
	/**
	 * PASS=BY-VALUE EXAMPLES
	 * THIS DOES NOT CHANGE THE NAME
	 * STUDY THIS
	 */
	public static void test1(Person s, int x, int[] arr){
		String name = s.getFirstName();
		name = "Ilona";
		x = 5;
		arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
	}
	
	
	/**
	 * PASS=BY-VALUE EXAMPLES
	 * THIS DOES CHANGE THE NAME
	 *THIS ALSO CHANGES THE ARRAY
	 * NO METHOD CAN PERMANENTLY CHANGE AN INT 
	 * (you can if you set it as a return type)
	 */
	
	public static void test2(Person s, int x, int[] arr){
		s.setFirstName("Ilona");
		x = 5;
		arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
	}
	
	public static void test3(Person s, int x, int[] arr){
		s.setFirstName("Ilona");
		x = 5;
		//arr = new int[3]; as long as you dont make a new array
		//the references themselves will change
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
	}
}
