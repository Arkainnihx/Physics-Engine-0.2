package com.github.arkainnihx.physics.time;

import java.util.TimerTask;

import com.github.arkainnihx.physics.actor.Actor;
import com.github.arkainnihx.physics.library.Universe;

public class SimTick extends TimerTask {
	
	Universe myUniverse;
	
	public SimTick(Universe myUniverse) {
		this.myUniverse = myUniverse;
	}
	
	@Override
	public void run() {
		for (Actor element: myUniverse.getShapeList()) {
			element.onTick();
		}
	}
}
