package userdefinedDI.springcontainer;

public class Student {

	private int id;
	private Teacher teacher;

	public void study() {
		teacher.teach();
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", teacher=" + teacher + "]";
	}

}
