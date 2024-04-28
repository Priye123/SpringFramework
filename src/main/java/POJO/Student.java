package POJO;

public class Student {
	private String name;
	private int rollno;
	private String email;

	public void setName(String name) {
		this.name = name;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", rollno=" + rollno + ", email='" + email + '\'' + '}';
	}
}
