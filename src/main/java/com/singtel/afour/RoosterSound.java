package com.singtel.afour;

public class RoosterSound implements SoundBehaviourIF{
	
	@Override
	public String sound(){
		System.out.println("Cock-a-doodle-doo");
		return "Cock-a-doodle-doo";
	}

}
