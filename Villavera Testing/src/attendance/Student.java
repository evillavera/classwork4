package attendance;

public class Student implements Attendee {
	
	private boolean isHere = false;
	private String firstName;
	private String lastName;
	
	
	
	public Student(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}

	public boolean isPresent() {
		if(isHere) {
			return true;
		}
		return false;
	}

	public void setPresent(boolean present) {
		isHere = present;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public boolean mathces(String first, String last) {
		if(first == firstName && last == lastName)
			return true;
		
		return false;
	}

	public boolean matches(String last) {
		if(last == lastName)
			return true;
		
		return false;
	}

	//returns three words separated by 20 spaces: 
		//at index 0, the last name
		//at index 20, the first name
		//at index 40, the word PRESENT or ABSENT
		//ADDED CHALLENGE:
		//if last name or first name is longer than 20 characters, 
		//cut off the last three letters and replace with "..."
	
	public String getReportString() {
		String output = lastName;
		while(output.length() < 20) {
			output += " ";
		}
			output += firstName;
		while(output.length() < 40) {
			output += " ";
		}
			if(isHere) {
				output += "PRESENT";
				return output;
			}
		output += "ABSENT";	
		return output;
	}

}
