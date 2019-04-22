package util;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import entity.Cat;
import entity.Mouse;

@Aspect
public class Log {
	
	@Pointcut("execution(* entity.Cat.catchMouse(..))")
	public void pointcut(){
	}
	
	@Before("pointcut()")
	public void writeLog(JoinPoint point) {
		//ͨ��point.getTarget()��ȡ����֯��Ķ���
		Cat cat=(Cat)point.getTarget();
		//ͨ��point.getArgs()��ȡ���ӵ�Ĳ���
		String catName=cat.getName();
		Object[] objs=point.getArgs();
		Mouse mouse=(Mouse)objs[0];
		String loc=objs[1].toString();
		System.out.println("��־��Ϣ��"+cat.getName()+"è��"+loc+"ץ������"+mouse.getName()+",ʱ��:"+new Date().toLocaleString()+"");
	}
	
	@After("pointcut()")
	public void finish(){
		System.out.println("èץ�����������");
	}


}
