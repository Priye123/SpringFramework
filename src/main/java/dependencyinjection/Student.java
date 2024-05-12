package dependencyinjection;

public class Student {
	private String name;
	private int rollno;
	private String email;
	private Address address;

	public void setName(String name) {
		this.name = name;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", email=" + email + ", address=" + address + "]";
	}

}
