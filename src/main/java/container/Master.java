package container;

import POJO.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Master {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        Student student = (Student) context.getBean("s");//new Student();
//        System.out.println(student.getName());
//        System.out.println(student.getRollno());
//        System.out.println(student.getEmail());
        System.out.println(student.toString());
    }
}
