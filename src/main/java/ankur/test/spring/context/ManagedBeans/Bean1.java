package ankur.test.spring.context.ManagedBeans;

public class Bean1 {

	private String name;
	
	private String occupation;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public String toString(){
		return name.concat(" " + occupation);
	}
}
