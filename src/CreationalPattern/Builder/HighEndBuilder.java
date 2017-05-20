package CreationalPattern.Builder;

//高端汽车制造者
public class HighEndBuilder implements IBuilder{

	@Override
	public void buildEngine() {
		// TODO Auto-generated method stub
		System.out.println("高端配置汽车的发动机配置为：2.6T");
	}

	@Override
	public void buildBodyFrame() {
		// TODO Auto-generated method stub
		System.out.println("高端配置汽车的车身配置为：复合材料车身");
	}

	@Override
	public void buildSeat() {
		// TODO Auto-generated method stub
		System.out.println("高端配置汽车的座椅配置为：小牛皮座椅");
	} 
}
