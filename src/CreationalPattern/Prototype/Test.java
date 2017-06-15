package CreationalPattern.Prototype;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub

		//简历
		Resume cc=new Resume();
		cc.setName("CC");
		cc.setSex("Man");
		cc.setAge("29");
		cc.setExperience("做过两个项目！", "当过五年班长！");
		cc.showInfo();
		
		Resume mn=(Resume) cc.shallowClone();//浅克隆
		mn.setName("MN");
		mn.setExperience("没有做过项目！","没有当过学生干部！");
		cc.showInfo();
		mn.showInfo();
		
		Resume dd=(Resume) cc.deepClone();//深克隆
		dd.setName("DD"); //蹬蹬
		dd.setExperience("做过一个项目！", "当过一年班长！");
		cc.showInfo();
		dd.showInfo();
		
     /*结果分析：
		1.由于Name属性是基本数据类型，所以每次克隆(包括浅、深克隆)，Name变量都会重新new一块内存，对象mn、dd的Name值都不会影响对象cc的Name值
		2.由于Experience是复杂对象，所以mn浅克隆会影响cc的Experience值，而深克隆的dd则不会影响。
		3.所谓的浅、深克隆是针对某个对象类中的复杂对象属性而言的，对于对象中的8个基本属性值则没有影响
    */
		
	}

}
