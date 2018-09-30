package com.singtel.athree;

public class FlyWithWings implements FlyBehaviourIF{
	
	@Override
	public String fly(){
		System.out.println("I am flying");
		return "I am flying";
	}

}
