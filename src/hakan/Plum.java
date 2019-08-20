package hakan;

public class Plum {
	private String girlName;
	
	public Plum(String name) {  // This is constructor
		girlName=name;
	}

	public void setName(String name) {
		girlName = name;

	}

	public String getName() {
		return girlName;
	}

	public void saying() {
		System.out.printf("Your first girlfriend was %s/n", getName());
	}
}
