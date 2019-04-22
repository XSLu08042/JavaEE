package entity;

import java.util.List;

public class Department {
		private String deptid;
		private String deptname;
		//πÕ‘±ºØ∫œ
		private List<Employee> employees;
		
		public String getDeptid() {
			return deptid;
		}
		public void setDeptid(String deptid) {
			this.deptid = deptid;
		}
		public String getDeptname() {
			return deptname;
		}
		public void setDeptname(String deptname) {
			this.deptname = deptname;
		}
		public List<Employee> getEmployees() {
			return employees;
		}
		public void setEmployees(List<Employee> employees) {
			this.employees = employees;
		}

}
