package arrays;

public class ObjectArrays {

	public ObjectArrays() {
//		Object[] people = new Object[5];
		Person[] people = new Person[10];
		populate(people);
//		people[0] = new Thing("coffee maker");
		for(Object p: people) {
			System.out.println(p);
		}
		for(Object r: selectGroup(people, 5)) {
			System.out.print("\nHas been randomly selected!\n");
			System.out.println(r);
			
		}
//		
//		for(Person p: people) {
//			p.mingle(people);
//			p.printFriends();
//			System.out.println("");
//		}
	}
	
	/**
	 * return the number of differences between the two arrays
	 * A "difference" means they dont have the same element
	 * at the same position
	 * Assume that the arrays are the same length
	 */
	
	public int countDifferences(Person[] arr1, Person[] arr2) {
		int output = 0;
		for(int i = 0; i < arr1.length;i++) {
			if(arr1[i] != arr2[i]) {
				output++;
			}
		}
		return output;
	}
	
	
	private void populate(Object[] people) {
		for(int i = 0; i < people.length; i++) {
			String firstName = randomNameFrom(Person.FIRST_START, Person.FIRST_MIDDLE, Person.FIRST_END);
			String lastName = randomNameFrom(Person.LAST_START, Person.LAST_MIDDLE, Person.LAST_END);
			Borough b = randomBorough();
			//Generating students
			//BIG IDEA: We can put data from a subclass into a superclass
			//In Object[] (but not primitive arrays like int[] or double[])
			//You can have multiple data types (sub-classes of the declared type)
			//In this case our Person[] can contain all sub-classes of Person aka Student
			if(Math.random() < .6) {
				//60% of the time...
				int grade = (int)(Math.random()*5)+9;
				people[i] = new Student(firstName, lastName, b, grade);
			}else {
				people[i] = new Person(firstName, lastName, b);
			}
		}
	}

	private Borough randomBorough() {
		return Borough.NY_BOROUGHS[(int)(Math.random()*Borough.NY_BOROUGHS.length)];
	}

	private String randomNameFrom(String[] a, String[] b, String[] c) {
		return get(a) + get(b) + get(c);
	}

	private String get(String[] a) {
		return a[(int)(Math.random()*a.length)];
	}
	
	public Person[] selectGroup(Person[] population, int length) {
		Person[] output = new Person[length];
		for(int i = 0; i < length; i++) {
			Person input = getRandomNoRepeats(output);
			while(input == null) {
				input = getRandomNoRepeats(output);
			}
			output[i] = input;
		}
		return output;
	}

	private Person getRandomNoRepeats(Person[] output) {
		Person person = getRandomPerson(output);
		boolean searching = true;
		while(searching) {
			for(Person compare: output) {
				if(person.equals(compare)) {
					return null;
				}
			}
		}
		return person;
	}

	private Person getRandomPerson(Person[] arr) {
		int random = (int)(Math.random()*arr.length);
		
		return arr[random];
	}
	
	
}