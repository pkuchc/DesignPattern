package CreationalPattern.Builder;

public interface IBuilder {
	
	public void buildEngine();   //建造发动机
	public void buildBodyFrame();//建造车身
	public void buildSeat();     //建造座椅

}
