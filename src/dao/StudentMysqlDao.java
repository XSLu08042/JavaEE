package dao;

import org.springframework.stereotype.Repository;

@Repository("stuMysqlDao")
public class StudentMysqlDao  implements StudentDao{
		public void insertStudent(){
			System.out.println("��mysql���ݿ��гɹ�����һ��ѧ��");
		}
}
