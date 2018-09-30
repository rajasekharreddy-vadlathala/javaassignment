package com.singtel.eone;

public class Butterfly extends Animal {
	
	@Override
	public boolean fly() {
		return true;
	}

	@Override
	public boolean swim() {
		return false;
	}

	@Override
	public boolean walk() {
		return false;
	}

	@Override
	public boolean sing() {
		return false;
	}
}
