package StructuralPattern.Decorator;

public class Decorator3 implements IDancer{//游戏玩家3：比较喜欢肚皮舞，要求跳舞的时候穿上露肚脐的服装
	private IDancer dancer;
	public Decorator3(IDancer dancer){
		super();
		this.dancer=dancer;
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("Game palyer3:  Dancer have to dress dew naverl clothes to dance!");
		dancer.dance();
	} 
}
