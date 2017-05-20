package CreationalPattern.Builder;

//低端配置汽车制造者
public class LowEndBuilder implements IBuilder{

	@Override
	public void buildEngine() {
		// TODO Auto-generated method stub
		System.out.println("低端配置汽车的发动机配置为：1.8T");
	}

	@Override
	public void buildBodyFrame() {
		// TODO Auto-generated method stub
		System.out.println("低端配置汽车的车身配置为：普通强度车身");
	}

	@Override
	public void buildSeat() {
		// TODO Auto-generated method stub
		System.out.println("低端配置汽车的座椅配置为：仿真皮质座椅");
	} 

}
