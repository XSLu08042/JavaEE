package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Cat;
import entity.Mouse;

public class CatTest {
		public static void main(String[] args) {
			//�ڲ������е���catchMouse����
			//��ʼ��һ������������
			ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
			//��context�л�ȡbean��ִ��catchMouse����
			Cat cat=(Cat)context.getBean("cat");	
			cat.setName("huahua");
			Mouse mouse=(Mouse)context.getBean("mouse");
			mouse.setName("et");
			cat.catchMouse(mouse,"����");

		}
}
