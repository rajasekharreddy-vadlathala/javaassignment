package com.singtel.atwo;

public class ChickenSwim implements SwimBehaviourIF{

	@Override
	public String swim() {
		System.out.println("Chicken can't swim");
		return "Chicken can't swim";
	}

}
