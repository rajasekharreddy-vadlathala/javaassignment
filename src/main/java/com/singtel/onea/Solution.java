package com.singtel.onea;

public class Solution {
	
	public static void main(String args[]){
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		/**
		 * The method sing() is undefined for the type Bird,
		 * so we have to implement sing() method either in super Animal or Bird subclass
		 * 
		 * */
		//bird.sing();
		
	}

}
