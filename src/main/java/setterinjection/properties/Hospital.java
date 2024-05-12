package setterinjection.properties;

import java.util.Properties;

//Hospital has name & list of departments
//setter injection(setter methods)
public class Hospital {

	private String name;
	private Properties patients;

	public void setName(String name) {
		this.name = name;
	}

	public void setPatients(Properties patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", patients=" + patients + "]";
	}

}
