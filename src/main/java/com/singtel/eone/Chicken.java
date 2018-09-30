package com.singtel.eone;

public class Chicken extends Bird {
	
	@Override
	public boolean swim() {
		return false;
	}

	@Override
	public boolean walk() {
		return true;
	}

	@Override
	public boolean fly() {
		return false;
	}

	@Override
	public boolean sing() {
		return false;
	}

}
