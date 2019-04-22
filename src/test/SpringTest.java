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
			service.setName("����");
			service.sayHello();*/			
			
			//ʹ��spring��ܼ��������ļ�����ʼ������������
			ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
			
			/*//sping��ܴ������ļ����ҵ�id= userService�����ã�������Ӧ�Ķ���ֵ��service
			//ǿ��ת����getbean����
				UserService service1=(UserService)act.getBean("userService");
				service1.setName("��˼˼");  //����ǰ��xml�ļ�����
				service1.sayHello();*/
			
			/*//
			Employee employee=(Employee)act.getBean("emp");
			System.out.println(employee.getName()+" "+employee.getSex()+" "+employee.getAge());*/
			
			/*//ʵ����;
			Employee employee=(Employee)act.getBean("dept");
			System.out.println(employee.getName()+" "+employee.getSex()+" "+employee.getAge()+employee.getDept().getDeptid()+employee.getDept().getDeptname());*/
			
			//����
			/*Department   service= (Department)act.getBean("dept1");
			for( Employee employee:service.getEmployees()) {
				System.out.println(employee.getName()+" "+employee.getSex()+" "+employee.getAge()+ service.getDeptid()+ service.getDeptname());
			}*/
			
	/*		//ת����Сд
			UpperLetter  service=(UpperLetter)act.getBean("changeLetter");
			String result=service.change(letter);
			System.out.println(result);*/
			
			//ת����Сд
			ChangeLetter  service=(ChangeLetter)act.getBean("changeLetter");
			String result=service.change(letter);
			System.out.println(result);
		}
}
