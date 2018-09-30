package com.singtel.athree;

import com.singtel.athree.SoundBehaviourIF;

public class RoosterSound implements SoundBehaviourIF{
	public String sound(){
		System.out.println("Cock-a-doodle-doo");
		return "Cock-a-doodle-doo";
	}
}
