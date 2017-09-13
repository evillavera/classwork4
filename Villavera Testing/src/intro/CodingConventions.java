package intro;

//class is a file describing a new data type 
public class CodingConventions {

	
	//fields
	private String name;
	private String description;
	
	/*
	//this is a special method, a "constructor"
	//notice it does not have a return type,
	//that is because the thing it returns is an instance of the class
	 * therefore the name of a constructor must always
	 *  match the name of the class
	 */
	public CodingConventions(String name, int index){
		//In Java, fields are instantiated in a constructor
		//This make it into a field which means it is being referenced.
		//There is a local variable called 'name' and a field called 'name'
		//The field persists, but the local variable data is destroyed at the end of this method
		//Distinguish the field by using the reserved word "this"
		
		this.name = name;
		//static reference begins with a class name
		description = IntroMain.DESCRIPTIONS[index];
	}

	public void doStuff() {
		//static method call (does not change)
		System.out.println(name + description);//use a space between your operations
		System.out.print("The square root of 12 is "+ Math.sqrt(12));
	}
	
}
