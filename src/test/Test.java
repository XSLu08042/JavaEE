package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.StudentService;

public class Test {
		public static void main(String[] args) {
			//ʹ��spring��ܼ��������ļ�����ʼ������������
			ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");

			StudentService service=(StudentService)act.getBean("studentService");
			//���÷���
			service.insert();

		}
}
