package com.singtel.atwo;

public class Duck extends Bird{
	
	private FlyBehaviourIF flyBehaviour;
	private SoundBehaviourIF soundBehaviour;
	
	private SwimBehaviourIF swimBehaviour;
	
	
	public void setSwimBehaviour(SwimBehaviourIF swimBehaviour) {
		this.swimBehaviour = swimBehaviour;
	}

	public String performSound(){
		return soundBehaviour.sound();
	}
	
	public String performFly(){
		return flyBehaviour.fly();
	}
	
	public String performSwim(){
		return swimBehaviour.swim();
	}
	
	public void setFlyBehaviour(FlyBehaviourIF flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	public void setSoundBehaviour(SoundBehaviourIF soundBehaviour) {
		this.soundBehaviour = soundBehaviour;
	}
	//common behaviour for all animals 
	public void walk(){
		System.out.println("I am walking");
	}

}
