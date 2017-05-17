package StructuralPattern.Decorator;

public class Decorator2 implements IDancer{//游戏玩家2：比较喜欢动感的，要求跳舞的时候穿上性感小短裙
	private IDancer dancer;
	public Decorator2(IDancer dancer){
		super();
		this.dancer=dancer;
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("Game palyer2: Dancer have to  dress sexy short skirt to dance!");
		dancer.dance();
	} 
}
