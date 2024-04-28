package container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import POJO.Teacher;
import javaconfig.JavaSpringConfigFileUsingAnnotation;

public class MasterUsingAnnotation {
	public static void main(String[] args) {

		// 1.XML based
//		ApplicationContext context = new ClassPathXmlApplicationContext("configurationusingannotation.xml");
//		Teacher t = (Teacher) context.getBean("teacher");
//		System.out.println(t.toString());

		// 2.Java Based
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaSpringConfigFileUsingAnnotation.class);
		Teacher t = (Teacher) context.getBean("teacher");
		System.out.println(t.toString());

	}
}
