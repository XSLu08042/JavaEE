package entity;

import util.Log;

public class Cat {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		//èץ���󷽷�
		public void catchMouse(Mouse mouse,String loc) {
			
			//��¼��־�Ĵ���
			/*Log log=new Log();
			log.writeLog();*/

			//èץ�����ҵ���߼�
			System.out.println("è"+this.name+"��"+loc+"ץ��������"+mouse.getName());
		}
}
