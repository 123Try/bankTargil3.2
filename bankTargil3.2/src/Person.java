
public class Person {

	private String name;
	private String ID;
	
	///Constructors
	
	public Person(String name, String ID) {
		try {
			if (ID.length()!=9)
				throw new Exception("Must Be 9 Digits"); 
			this.name=name;
			this.ID=ID;
		}
		catch (Exception e) {
			System.out.println(e);
			
		}
		
	}
	public Person(Person other) {
		this.name=other.name;
		this.ID=other.ID;
	}

	///Methods
	
	public String getName() {
		return name;
	}
	public String getID() {
		return ID;
	}
	
	@Override
	public String toString() {
		return "Person name=" + name + ", ID=" + ID ;
	}
	
	
	
}
