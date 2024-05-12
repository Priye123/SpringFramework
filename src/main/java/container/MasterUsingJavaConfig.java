package container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import POJO.Student;
import javaconfig.JavaSpringConfigFile;

public class MasterUsingJavaConfig {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaSpringConfigFile.class);
		Student student = (Student) context.getBean("sameer");
		System.out.println(student.toString());
	}

}
