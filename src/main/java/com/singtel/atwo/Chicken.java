package com.singtel.atwo;

public class Chicken extends Bird{

	private FlyBehaviourIF flyBehaviour;
	private SoundBehaviourIF soundBehaviour;
	private SwimBehaviourIF swimBehaviour;
	
	
	public String performSound(){
		return soundBehaviour.sound();
	}
	public String performFly(){
		return flyBehaviour.fly();
	}
	
	public String performSwim(){
		return swimBehaviour.swim();
	}
	
	//setters
	
	public void setFlyBehaviour(FlyBehaviourIF flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	public void setSoundBehaviour(SoundBehaviourIF soundBehaviour) {
		this.soundBehaviour = soundBehaviour;
	}
	public void setSwimBehaviour(SwimBehaviourIF swimBehaviour) {
		this.swimBehaviour = swimBehaviour;
	}
}
