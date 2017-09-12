package intro;

//class is a file describing a data type
public class CodingConventions {

	
	//fields(has-a relationship)
	private String name;
	private String description;
	
	
	/*
	this is a special method, a "constructor"
	notice it does not have a return type, 
	that is because the thing it returns is an instance of the class
	therefore the name of a constructor must always match
	the name of the class
	the fields made in the class is put into the constructor
	we assign value to the fields inside the constructor
	*/
	public CodingConventions() {
		//in Java, fields are instantiated in a constructor
		name = "Villavera";
		description = "Student";
	}
}
