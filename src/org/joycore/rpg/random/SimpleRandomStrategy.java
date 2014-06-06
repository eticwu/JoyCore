package org.joycore.rpg.random;

import java.util.Random;

public class SimpleRandomStrategy implements IRandomStrategy {

	@Override
	public boolean happen(Integer rate) {
		Random r = new Random();
		if (r.nextInt(100) <= rate) {
			return true;
		}
		return false;
	}

}
