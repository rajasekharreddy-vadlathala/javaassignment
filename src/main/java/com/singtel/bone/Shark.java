package com.singtel.bone;

public class Shark extends Fish{
	
private FishBehaviourIF fishBehaviour;
	
	public void setFishBehaviour(FishBehaviourIF fishBehaviour) {
		this.fishBehaviour = fishBehaviour;
	}

	@Override
	public String sing() {
		System.out.println("Sharks don’t sing");
		return "Sharks don’t sing";
	}

	@Override
	public String swim() {
		System.out.println("Sharks can swim");
		return "Sharks can swim";
	}

	@Override
	public String walk() {
		System.out.println("Sharks don't walk");
		return "Sharks don't walk";
	}
	
	public String getFishColor(){
		return fishBehaviour.color();
	}
	
	public String getFishBehaviour(){
		return fishBehaviour.behaviour();
	}

}
