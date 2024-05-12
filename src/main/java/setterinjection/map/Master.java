package setterinjection.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Master {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hosptal.xml");
		Hospital hospital = (Hospital) context.getBean("h");
		System.out.println(hospital);
	}

}
