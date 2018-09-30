package com.singtel.atwo;

public class Simulator {
	public static void main(String args[]){
		//Duck
		Duck duck = new Duck();
		duck.setFlyBehaviour(new FlyWithWings());
		duck.performFly();
		
		duck.setSoundBehaviour(new DuckSound());
		duck.performSound();
		
		duck.setSwimBehaviour(new DuckSwim());
		duck.performSwim();
		duck.walk();
		
		//Chicken
		Chicken chicken = new Chicken();
		chicken.setFlyBehaviour(new FlyWithoutWings());
		chicken.performFly();
		
		chicken.setSoundBehaviour(new ChickenSound());
		chicken.performSound();
		
		chicken.setSwimBehaviour(new ChickenSwim());
		chicken.performSwim();
		chicken.walk();
		
	}

}
