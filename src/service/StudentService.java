package service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import dao.StudentMysqlDao;

@Service
public class StudentService {
	
	//使用注解可以删掉get/set方法
	//如果是调用StudentOracle的方法，只需改一下注解里的制定id为name="stuOracle"
	/*这里注解还可以使用@Qualifier("stuMysqlDao")
     @Autowired	*/
	
		@Resource(name="stuMysqlDao")
		private StudentMysqlDao dao;
		
		public StudentMysqlDao getDao() {
			return dao;
		}

		public void setDao(StudentMysqlDao dao) {
			this.dao = dao;
		}

		public void insert(){
			this.dao.insertStudent();
		}

}
