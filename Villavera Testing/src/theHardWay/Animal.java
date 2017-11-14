package theHardWay;

public class Animal {

	private String description;
	
	private Trait trait1;
	private Trait trait2;
	private int age;
	private boolean mated;
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			Animal someAnimal = new Animal();
		}

	}
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public boolean isMated() {
		return mated;
	}

	public void setMated(boolean mated) {
		this.mated = mated;
	}

	public String getDescription() {
		return description;
	}

	public Trait getTrait1() {
		return trait1;
	}

	public Trait getTrait2() {
		return trait2;
	}

	public int getAge() {
		return age;
	}


}
