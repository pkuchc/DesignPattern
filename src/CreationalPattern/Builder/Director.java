package CreationalPattern.Builder;

////制造流程的指挥者，负责车的制造流程控制
public class Director {
//	private IBuilder builder;
//	public Director(IBuilder builder){
//		this.builder=builder;
//	}
	//生产产品的具体方法，必须控制多个流程之间的执行顺序，即先做什么，再做什么，最后做什么
	public void CreateCar_AudiA6(IBuilder builder){
		System.out.println("---------------开始制造汽车--------------");
		builder.buildBodyFrame();//建造车身
		builder.buildEngine();//建造发动机
		builder.buildSeat();//建造座椅
		System.out.println("---------------制造汽车结束--------------"+"\n");
		
	}

}
