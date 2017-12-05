package search;

public class FibonacciNumbers {

	public static void main(String[] args) {
		int value = 10;
		System.out.println(FibonnacciSequence(value));
	}

	private static int FibonnacciSequence(int value) {
		if(value == 0 || value == 1) {
			return 1;
		}else  {
			return FibonnacciSequence(value-1) + FibonnacciSequence(value-2);
		}
	}

}
