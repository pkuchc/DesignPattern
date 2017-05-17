package StructuralPattern.Adapter;


public class Adapter extends Target {//适配器类：将110V的电源转换成220V电压
//  private  Adaptee adaptee;
	private  Adaptee adaptee =new Adaptee();
//	public Adapter(Adaptee adaptee){
//		this.adaptee=adaptee;
//	}
	public Adapter(){
		super.request(); //仅仅是为了输出，并无实质作用
	}
	
	public void request(){

		int dian=adaptee.exitRequest();
		int requestDian=dian*2;//电源转换
		System.out.println("解决办法：通过适配器转换后的电压为"+requestDian+"V");
	}

}
