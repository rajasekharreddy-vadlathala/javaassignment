package com.singtel.bone;

public class ClownfishBehaviour implements FishBehaviourIF{
	
	@Override
	public String color() {
		System.out.println("Clownfish are small and colorful");
		return "Clownfish are small and colorful";
	}

	@Override
	public String behaviour() {
		System.out.println("Clownfish make jokes");
		return "Clownfish make jokes";
	}

}
