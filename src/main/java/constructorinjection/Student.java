package constructorinjection;

public class Student {
	private String name;
	private int rollno;
	private String email;

	public Student(String name, int rollno, String email) {
		this.name = name;
		this.rollno = rollno;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", email=" + email + "]";
	}

}
