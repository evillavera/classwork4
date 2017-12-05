package search;

public class TowersOfHanoi {

	/*
	 * 3 disk = 7 moves
	 * 4 disk = 15 moves
	 * 8 moves to move base plate ^^
	 * 7 moves to move the rest
	 * 5 disk = 
	 * 16 to move base plate
	 */
	
	public static void main(String[] args) {
		int disks = 6;
		String start = "A";
		String helper = "B";
		String end = "C";
		hanoi(disks, start, helper, end);
	}

	private static void hanoi(int disks, String start, String help, String end) {
		if(disks == 1) {
			System.out.println(start + " to " + end);
		}else {
			//move everything above bottom disk
			hanoi(disks - 1, start, end, help);
			System.out.println(start + " to " + end);
			hanoi(disks - 1, help, start, end);
		}
	}

}
