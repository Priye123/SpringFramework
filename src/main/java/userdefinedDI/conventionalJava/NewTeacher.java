package userdefinedDI.conventionalJava;

public class NewTeacher implements Teachable {

	@Override
	public void teach() {
		System.out.println("I am teaching with new techniques");
	}

}
