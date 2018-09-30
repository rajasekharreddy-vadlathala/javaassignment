package com.singtel.bone;

public class SharkBehaviour implements FishBehaviourIF{

	@Override
	public String color() {
		System.out.println("Sharks are large and grey color");
		return "Sharks are large and grey color";
	}

	@Override
	public String behaviour() {
		System.out.println("Sharks eat other fish");
		return "Sharks eat other fish";
	}

}
