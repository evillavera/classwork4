package arrays2D;

public class Main {

	public static void main(String[] args) {
		int[] test1 = {1,2,3};
		int[] test2 = {2,3};
		int[] test3 = {3};

	}

	/**
	 * increases the element in arr at index psn
	 * and decreases the element at psn-1 and psn +1
	 * if they exist.
	 * @param arr
	 * @param psn
	 * 
	 * This idea is another major topic in AP CSA
	 * It is the idea of avodiing an ArrayIndexOutOfBoundsException
	 * you will see it on quizzes, tests and project rubrics
	 * SO ALWAYS BE MINDFUL!
	 */
	
	public static void changeNeighbors(int[] arr, int psn) {
		arr[psn] = arr[psn] + 1;
		if(psn - 1 >= 0) {
			arr[psn -1]--;
		}
		if(psn + 1 <= arr.length-1) {
			arr[psn +1]--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
