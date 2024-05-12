package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import POJO.Student;

@Configuration
public class JavaSpringConfigFile {

//	<!-- bean definitions here -->
//    <!--    <bean class="POJO.Student" id="s">-->
//    <!--        <property name="name" value="Priye"/>-->
//    <!--        <property name="rollno" value="20"/>-->
//    <!--        <property name="email" value="priyerock@gmail.com"/>-->
//    <!--    </bean>-->

	@Bean("sameer")
	public Student createStuObj() {
		Student std = new Student();
		std.setName("Rahul");
		std.setRollno(20);
		std.setEmail("rjmishrarocks@gmail.com");
		return std;
	}
}
