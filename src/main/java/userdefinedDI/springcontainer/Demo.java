package userdefinedDI.springcontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("userdefined.xml");
		Student student1 = (Student) context.getBean("student1");
		System.out.println(student1);
		Student student2 = (Student) context.getBean("student2");
		System.out.println(student2);
		Student student3 = (Student) context.getBean("student3");
		System.out.println(student3);
		Student student4 = (Student) context.getBean("student4");
		System.out.println(student4);
		Student student5 = (Student) context.getBean("student5");
		System.out.println(student5);

		student1.study();
		student2.study();
		student3.study();
		student4.study();
		student5.study();
	}
}
