package userdefinedDI.conventionalJava;

public class Student {

	// private Teacher teacher;
	private Teachable teacher;

	public Student() {
		teacher = new NewTeacher();
	}

	public void study() {
		teacher.teach();
	}

}
