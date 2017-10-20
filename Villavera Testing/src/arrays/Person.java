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
	private Hobby hobby;
	private Person[] friends;
	private String nickname;
	
	
	public Person(String firstName, String lastName, Borough home) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.home = home;
		this.hobby = Hobby.randomHobby();
		friends = new Person[3];
	}
	
	public static String createNickname(String name){
		String nickname = "";
		int secondVowelPsn = findSecond(name);
		nickname = name.substring(0,secondVowelPsn);
		return nickname;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		nickname = createNickname(firstName);
	}
	

	private static int findSecond(String word){
		boolean foundVowel = false;
		word = word.toLowerCase();
		int index = word.length();
		for(int i = 0; i < word.length();i++){
			if(word.substring(i,i+1).equals("a") || 
				word.substring(i,i+1).equals("e") ||
				word.substring(i,i+1).equals("i") ||
				word.substring(i,i+1).equals("o") ||
				word.substring(i,i+1).equals("u")){
				if(!foundVowel){
					foundVowel = true;
				}else{
					return i;
				}	
			}
		}
		return index;
	}
	
	
	/**
	 * chooses friends from People based on who is of the same 
	 * class as this instance and who has the same hobbies
	 */
	
	public void mingle(Person[] people) {
		for(Person p: people) {
			if(p != this) {
				//reassign p to the better of the two friends:
				//your current best friend or p
				p = betterFriend(p, friends[0]);
				
				addFriendToFirstPlace(p);
			}
		}
	}
	
	private Person betterFriend(Person p, Person q) {
		//having a friend is better than no friend at all
		if(p == null) {
			return q;
		}
		if(q == null) {
			return p;
		}
		if(p.getClass() == this.getClass() && q.getClass() == this.getClass()) {
			if(p.hobby == this.hobby) {
				return p;
			}else if(q.hobby == this.hobby) {
				return q;
			}
		}
			
		if(p.getClass() == this.getClass()) {
			return p;
		}
		if(q.getClass() == this.getClass()) {
			return q;
		}
		//if none of these are true, just take p
		return p;
	}

	public void printFriends() {
		System.out.println("My name is "+firstName+lastName+
				" and these are my friends:");
		for(Person f: friends) {
			if(f != null) System.out.println(f);
		}
	}
	/**
	 * Moves all Person in friends back one index and puts p at index 0
	 * @param p
	 */
	
	public void addFriendToFirstPlace(Person p) {
		//this for loop goes backwards
		for(int i = friends.length-1; i > 0; i--) {
			friends[i] = friends[i-1];
		}
		friends[0] = p;
	}

	public String toString() {
		return "My name is " + firstName+ " " + lastName + " My nickname is " + nickname + " and I live in "+ home + ". I like "+ hobby;
	}

}
