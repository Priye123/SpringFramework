package setterinjection.map;

import java.util.Map;

//Hospital has name & list of departments
//setter injection(setter methods)
public class Hospital {

	private String name;
	private Map<Integer, String> patients;

	public void setName(String name) {
		this.name = name;
	}

	public void setPatients(Map<Integer, String> patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", patients=" + patients + "]";
	}

}
