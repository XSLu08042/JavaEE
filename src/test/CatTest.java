package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Cat;
import entity.Mouse;

public class CatTest {
		public static void main(String[] args) {
			//在测试类中调用catchMouse方法
			//初始化一个容器上下文
			ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
			//从context中获取bean并执行catchMouse方法
			Cat cat=(Cat)context.getBean("cat");	
			cat.setName("huahua");
			Mouse mouse=(Mouse)context.getBean("mouse");
			mouse.setName("et");
			cat.catchMouse(mouse,"火星");

		}
}
