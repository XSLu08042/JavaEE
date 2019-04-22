package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.StudentService;

public class Test {
		public static void main(String[] args) {
			//使用spring框架加载配置文件，初始化容器上下文
			ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");

			StudentService service=(StudentService)act.getBean("studentService");
			//调用方法
			service.insert();

		}
}
