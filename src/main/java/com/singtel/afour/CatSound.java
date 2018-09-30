package com.singtel.afour;

public class CatSound implements SoundBehaviourIF{
	
	@Override
	public String sound(){
		System.out.println("Meow");
		return "Meow";
	}

}
