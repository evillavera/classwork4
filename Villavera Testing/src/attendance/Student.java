package attendance;

public class Student implements Attendee {
	
	private boolean isHere = false;
	private String firstName = "Erik";
	private String lastName = "Villavera";
	
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

	@Override
	public boolean mathces(String first, String last) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean matches(String last) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getReportString() {
		// TODO Auto-generated method stub
		return null;
	}

}
