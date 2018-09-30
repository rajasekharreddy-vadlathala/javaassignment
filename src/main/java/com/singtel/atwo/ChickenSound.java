package com.singtel.atwo;

public class ChickenSound implements SoundBehaviourIF{
	
	@Override
	public String sound(){
		System.out.println("Cluck, cluck");
		return "Cluck, cluck";
		
	}
}
