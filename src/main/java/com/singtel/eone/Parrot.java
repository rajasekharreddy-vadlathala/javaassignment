package com.singtel.eone;

public class Parrot extends Bird{
	
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
		return true;
	}

	@Override
	public boolean sing() {
		return true;
	}
}
