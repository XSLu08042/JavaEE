package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Student;
import entity.Class;

public class StudentTest {
		public static void main(String[] args) {
				ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
				
				Class   service= (Class)act.getBean("class1");
				for( Student student:service.getStudents()) {
					System.out.println(student.getName()+" "+student.getSex()+" "+student.getAge()+" "+ service.getClassno()+" "+ service.getClassname());
				}
		}
}
