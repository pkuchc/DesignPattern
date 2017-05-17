package StructuralPattern.Adapter;

public class Adaptee {
	public int exitRequest(){
		System.out.println("现状：美国只提供110V的电源，无法提供220V的电源");
		return 110;
	}

}
