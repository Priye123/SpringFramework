package dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Master {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("diwithsetter.xml");
		Student s = (Student) context.getBean("st");
		System.out.println(s);

	}
}
