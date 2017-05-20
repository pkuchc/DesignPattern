package CreationalPattern.Builder;

//客户端测试
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 //奥迪A6 低配、中配、高配三种车的具体制造者
     IBuilder lowCar=new LowEndBuilder();
     IBuilder middleCar=new MiddleEndBuilder();
     IBuilder HighCar=new HighEndBuilder();
     
     //制造流程的指挥者，负责车的制造流程控制
     Director director=new Director();
     director.CreateCar_AudiA6(lowCar);
     director.CreateCar_AudiA6(middleCar);
     director.CreateCar_AudiA6(HighCar);
	}

}
