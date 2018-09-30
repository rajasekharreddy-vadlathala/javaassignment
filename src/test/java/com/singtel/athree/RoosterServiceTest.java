package com.singtel.athree;

import org.junit.Test;

import junit.framework.Assert;

public class RoosterServiceTest {
	
	@Test
	public void testRoosterService(){
		Rooster rooster = new Rooster();
		rooster.setFlyBehaviour(new FlyWithWings());
		Assert.assertEquals("I am flying",rooster.performFly());
		
		rooster.setSoundBehaviour(new RoosterSound());
		Assert.assertEquals("Cock-a-doodle-doo",rooster.performSound());
		
		rooster.walk();
	}

}
