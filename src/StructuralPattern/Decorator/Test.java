package StructuralPattern.Decorator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     IDancer dancer=new Dancer();
     dancer.dance();  //舞者角色最主要的功能，就是跳舞，穿什么衣服只是装饰作用
     
      //满足用户1穿新疆民族衣服的需求
     IDancer dancer1=new Decorator1(dancer);
     dancer1.dance();
     
     //满足用户2穿性感爵士舞的需求
     IDancer dancer2=new Decorator2(dancer);
     dancer2.dance();
     
    //满足用户3穿露肚脐装需求
     IDancer dancer3=new Decorator3(dancer);
     dancer3.dance();
	}

}
