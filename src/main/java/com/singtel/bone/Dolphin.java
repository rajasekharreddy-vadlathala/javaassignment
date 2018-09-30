package com.singtel.bone;

public class Dolphin implements SwimBehaviourIF{

	@Override
	public String swim() {
		System.out.println("Dolphins are good swimmers");
		return "Dolphins are good swimmers";
	}

}
