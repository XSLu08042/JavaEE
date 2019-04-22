package service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import dao.StudentMysqlDao;

@Service
public class StudentService {
	
	//ʹ��ע�����ɾ��get/set����
	//����ǵ���StudentOracle�ķ�����ֻ���һ��ע������ƶ�idΪname="stuOracle"
	/*����ע�⻹����ʹ��@Qualifier("stuMysqlDao")
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
