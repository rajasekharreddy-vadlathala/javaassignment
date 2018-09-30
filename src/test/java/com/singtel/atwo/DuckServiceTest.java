package com.singtel.atwo;

import org.junit.Test;

import junit.framework.Assert;

public class AnimalServiceTest {

	@Test
	public void test(){
		Duck duck = new Duck();
		duck.setFlyBehaviour(new FlyWithWings());
		Assert.assertEquals("I am flying",duck.performFly());

		duck.setSoundBehaviour(new DuckSound());
		Assert.assertEquals("Quack, quack",duck.performSound());

		duck.setSwimBehaviour(new DuckSwim());
		Assert.assertEquals("Duck can Swim",duck.performSwim());

		//Chicken
		Chicken chicken = new Chicken();
		chicken.setFlyBehaviour(new FlyWithoutWings());
		Assert.assertEquals("I am not flying",chicken.performFly());

		chicken.setSoundBehaviour(new ChickenSound());
		Assert.assertEquals("Cluck, cluck",chicken.performSound());

		chicken.setSwimBehaviour(new ChickenSwim());
		Assert.assertEquals("Chicken can't swim",chicken.performSwim());
	}

}
