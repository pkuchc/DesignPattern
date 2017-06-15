package CreationalPattern.Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//简历类，原型对象，需要复制多个简历类实例
public class Resume implements Cloneable,Serializable{ 
	private String name=null;
	private String sex=null;
	private String age=null;
	private Experience experience=new Experience(); //经历（复杂对象，非8种基本数据类型）
	public Resume(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public void setExperience(String projectExpirence,String leaderExperience) {
		experience.setProjectExperience(projectExpirence); 
		experience.setLeaderExperienc(leaderExperience);
	}
	public void showInfo(){
		System.out.println("----------------------------------------------------------");
		System.out.println("name:"+name+"\tsex:"+sex+"\tage:"+age);
		System.out.println("projectExpirence:"+experience.getProjectExperience()+
				"\tleaderExperience"+experience.getLeaderExperienc());

	}
   //浅克隆
	public Object shallowClone() throws CloneNotSupportedException{
		Resume resume=(Resume) super.clone();
		return resume;
	}
	//深克隆
	//方法一：通过将对象写入二进制流，再从二进制流读出对象
	public Object deepClone() throws IOException, ClassNotFoundException{
		//将当前对象写入二进制流
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(this);
		oos.close();
		//从二进制流中读出新对象
		ByteArrayInputStream bis =new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bis);
		return ois.readObject();
		
	}
	//方法二：对复杂对象属性进行逐层复制，直至子对象所有的属性都是8种基本数据类型
	
}
