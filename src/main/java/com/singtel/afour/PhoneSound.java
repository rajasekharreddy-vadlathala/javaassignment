package com.singtel.afour;

public class PhoneSound implements SoundBehaviourIF {
	
	@Override
	public String sound(){
		System.out.println("Tring tring");
		return "Tring tring";
	}

}
