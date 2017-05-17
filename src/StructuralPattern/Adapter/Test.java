package StructuralPattern.Adapter;

public class Test {

	public static void main(String[] args) { //对于客户来说，他调用的就是target的request方法，我们在中间只不过做了适配，
		                                     //客户可以毫不知情，也无需关心，只知道最后要调用自己提出的目标类方法
		// TODO Auto-generated method stub
    //   Adaptee adaptee=new Adaptee(); 
   //    Target target=new Adapter(adaptee);
		Target target=new Adapter();//在新建目标Target类时，为客户提供适配器类
        target.request(); //客户只需要调用自己要求的方法
	}

}
