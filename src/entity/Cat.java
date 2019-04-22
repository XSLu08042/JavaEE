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
		//猫抓老鼠方法
		public void catchMouse(Mouse mouse,String loc) {
			
			//记录日志的代码
			/*Log log=new Log();
			log.writeLog();*/

			//猫抓老鼠的业务逻辑
			System.out.println("猫"+this.name+"在"+loc+"抓到了老鼠"+mouse.getName());
		}
}
