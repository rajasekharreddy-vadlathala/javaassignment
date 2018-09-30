package com.singtel.afour;

public class DogSound implements SoundBehaviourIF {
	
	@Override
	public String sound(){
		System.out.println("Woof, woof");
		return "Woof, woof";
	}
}
