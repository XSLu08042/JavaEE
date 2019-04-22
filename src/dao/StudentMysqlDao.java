package dao;

import org.springframework.stereotype.Repository;

@Repository("stuMysqlDao")
public class StudentMysqlDao  implements StudentDao{
		public void insertStudent(){
			System.out.println("向mysql数据库中成功插入一个学生");
		}
}
