package search;

public class FibonacciNumbers {

	public static void main(String[] args) {
		int value = 3;
		System.out.println(FibonnacciSequence(value));
	}

	private static int FibonnacciSequence(int value) {
		if(value == 0) {
			return 1;
		}else  {
			return value-1 + FibonnacciSequence(value-1);
		}
	}

}
