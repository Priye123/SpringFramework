package setterinjection.list;

import java.util.List;

//Hospital has name & list of departments
//setter injection(setter methods)
public class Hospital {

	private String name;
	private List<String> departments;

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}

	public String getName() {
		return name;
	}

	//[.....]
	public List<String> getDepartments() {
		return departments;
	} 

}
