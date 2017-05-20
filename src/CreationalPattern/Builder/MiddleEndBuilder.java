package CreationalPattern.Builder;

//中端配置汽车制造者
public class MiddleEndBuilder implements IBuilder{

	@Override
	public void buildEngine() {
		// TODO Auto-generated method stub
		System.out.println("中端配置汽车的发动机配置为：2.0T");
	}

	@Override
	public void buildBodyFrame() {
		// TODO Auto-generated method stub
		System.out.println("中端配置汽车的车身配置为：加强强度车身");
	}

	@Override
	public void buildSeat() {
		// TODO Auto-generated method stub
		System.out.println("中端配置汽车的座椅配置为：真皮座椅");
	} 
}
