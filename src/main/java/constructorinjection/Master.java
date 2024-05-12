package constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Master {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configurationconstructorinjection.xml");
		Student s = (Student) context.getBean("st");
		System.out.println(s);
//		Student s1 = (Student) context.getBean("st");
//		System.out.println(s1);

	}
}
