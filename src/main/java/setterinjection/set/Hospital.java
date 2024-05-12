package setterinjection.set;

import java.util.Set;

//Hospital has name & list of departments
//setter injection(setter methods)
public class Hospital {

	private String name;
	private Set<String> departments;

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartments(Set<String> departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", departments=" + departments + "]";
	}

}
