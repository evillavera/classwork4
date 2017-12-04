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
		int disks = 3;
		instructions(disks);
	}

	private static void instructions(int disks) {
		if(disks == 1) {
			 System.out.println("Move disk to destination");
		}else if(disks%2==0){
			System.out.println("Move to helper from start");
			instructions();
		}else {
			System.out.println("Move to destination from start");
			instructions();
		}
	}

}
