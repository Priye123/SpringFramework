package userdefinedDI.conventionalJava;

public class Teacher implements Teachable {

	@Override
	public void teach() {
		System.out.println("I am teaching students");
	}

}
