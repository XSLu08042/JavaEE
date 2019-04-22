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
		//通过point.getTarget()获取切面织入的对象
		Cat cat=(Cat)point.getTarget();
		//通过point.getArgs()获取连接点的参数
		String catName=cat.getName();
		Object[] objs=point.getArgs();
		Mouse mouse=(Mouse)objs[0];
		String loc=objs[1].toString();
		System.out.println("日志信息："+cat.getName()+"猫在"+loc+"抓到老鼠"+mouse.getName()+",时间:"+new Date().toLocaleString()+"");
	}
	
	@After("pointcut()")
	public void finish(){
		System.out.println("猫抓到老鼠结束了");
	}


}
