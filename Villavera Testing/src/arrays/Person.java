package arrays;

public class Person {

	//CONSTANTS
	public static final String[] FIRST_START = {"Chr","M","L","Ger","Er","Em","Th"};
	public static final String[] FIRST_MIDDLE = {"ist","eg","aur","tru","ik","m","e"};
	public static final String[] FIRST_END = {"","y","en","de","a","ma","o","les"};
	
	public static final String[] LAST_START = {"Cr","Ma","L","Ger","Er","Em","Th"};
	public static final String[] LAST_MIDDLE = {"op","ish","or","ren","o","a","e"};
	public static final String[] LAST_END = {"ly","man","en","de","a","son","o","les"};
	
	
	private String firstName;
	private String lastName;
	private Borough home;
	
	public Person(String firstName, String lastName, Borough home) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.home = home;
	}

	public String toString() {
		return "My name is " + firstName+ " " + lastName + " and I live in "+ home + ".";
	}

}
