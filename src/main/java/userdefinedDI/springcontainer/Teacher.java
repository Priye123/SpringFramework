package userdefinedDI.springcontainer;

public class Teacher {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void teach() {
		System.out.println("I am teaching students");
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + "]";
	}

}
