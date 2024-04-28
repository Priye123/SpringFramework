package POJO;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//bean name will be "teacher"
@Component
public class Teacher {

	@Value("Rahul")
	private String name;

	@Value("20")
	private int rollno;

	@Value("rahulrocks@gmail.com")
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
		return "Teacher [name=" + name + ", rollno=" + rollno + ", email=" + email + "]";
	}

}
