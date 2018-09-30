package com.singtel.athree;


public class Rooster extends Bird{
	private SoundBehaviourIF soundBehaviour;
	private FlyBehaviourIF flyBehaviour;

	public void setSoundBehaviour(SoundBehaviourIF soundBehaviour) {
		this.soundBehaviour = soundBehaviour;
	}

	public void setFlyBehaviour(FlyBehaviourIF flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	
	public String performSound(){
		return soundBehaviour.sound();
	}
	
	public String performFly(){
		return flyBehaviour.fly();
	}

}
