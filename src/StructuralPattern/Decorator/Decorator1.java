package StructuralPattern.Decorator;

public class Decorator1 implements IDancer{//装饰类和原始类必须实现同一个接口
	private IDancer dancer;
	public Decorator1(IDancer dancer){
		super();
		this.dancer=dancer;
	}

	@Override
	public void dance() {  //游戏玩家1：要求跳舞的时候穿上新疆民族服装
		// TODO Auto-generated method stub
		System.out.println("Game palyer1: Dancer have to dress Xinjiang national costume to dance!");
		dancer.dance();
	} 

}
