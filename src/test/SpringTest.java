package test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Department;
import entity.Employee;
import service.UserService;
import util.ChangeLetter;
import util.LowerLetter;
import util.UpperLetter;

public class SpringTest {
		public static void main(String[] args) {
			
			String letter="abcFGY";
		/*	UserService service=new UserService();
			service.setName("张三");
			service.sayHello();*/			
			
			//使用spring框架加载配置文件，初始化容器上下文
			ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
			
			/*//sping框架从配置文件中找到id= userService的配置，创建对应的对象赋值给service
			//强制转换和getbean方法
				UserService service1=(UserService)act.getBean("userService");
				service1.setName("李思思");  //换到前面xml文件中了
				service1.sayHello();*/
			
			/*//
			Employee employee=(Employee)act.getBean("emp");
			System.out.println(employee.getName()+" "+employee.getSex()+" "+employee.getAge());*/
			
			/*//实体类;
			Employee employee=(Employee)act.getBean("dept");
			System.out.println(employee.getName()+" "+employee.getSex()+" "+employee.getAge()+employee.getDept().getDeptid()+employee.getDept().getDeptname());*/
			
			//集合
			/*Department   service= (Department)act.getBean("dept1");
			for( Employee employee:service.getEmployees()) {
				System.out.println(employee.getName()+" "+employee.getSex()+" "+employee.getAge()+ service.getDeptid()+ service.getDeptname());
			}*/
			
	/*		//转换大小写
			UpperLetter  service=(UpperLetter)act.getBean("changeLetter");
			String result=service.change(letter);
			System.out.println(result);*/
			
			//转换大小写
			ChangeLetter  service=(ChangeLetter)act.getBean("changeLetter");
			String result=service.change(letter);
			System.out.println(result);
		}
}
