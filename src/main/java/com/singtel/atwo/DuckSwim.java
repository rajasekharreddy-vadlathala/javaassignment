package com.singtel.atwo;

public class DuckSwim implements SwimBehaviourIF{

	@Override
	public String swim() {
		System.out.println("Duck can Swim");
		return "Duck can Swim";
	}

}
