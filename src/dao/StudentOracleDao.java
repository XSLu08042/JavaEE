 package dao;

import org.springframework.stereotype.Repository;

@Repository("stuOracleDao")
public class StudentOracleDao implements StudentDao{
		public void insertStudent(){
			System.out.println("��mysql���ݿ��гɹ�����һ��ѧ��");
		}
}
