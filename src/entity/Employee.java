package entity;

public class Employee {
		private String name;
		private int age;
		private String sex;
		//部门
		private Department dept;
		public Employee() {
			
		}
		
		//构造函数
		public Employee(String name,int age,String sex){
			this.name=name;
			this.age=age;
			this.sex=sex;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}

		public Department getDept() {
			return dept;
		}

		public void setDept(Department dept) {
			this.dept = dept;
		}
		

}
