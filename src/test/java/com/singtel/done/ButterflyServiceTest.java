package com.singtel.done;

import org.junit.Test;

public class ButterflyServiceTest {

	@Test
	public void testFishService(){
		Caterpillar caterpillar = new Caterpillar();
		caterpillar.walk();
		caterpillar.fly();

		caterpillar.setFlyBehaviour(new Butterfly());
		caterpillar.setSoundBehaviour(new Butterfly());

		caterpillar.performAction();
	}
}

