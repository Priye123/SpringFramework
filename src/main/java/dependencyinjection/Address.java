package dependencyinjection;

public class Address {

	private String houseno;
	private String city;

	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", city=" + city + "]";
	}
	

}
