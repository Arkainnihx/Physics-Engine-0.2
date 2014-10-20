package com.github.arkainnihx.physics.time;

import java.util.TimerTask;

import com.github.arkainnihx.physics.actor.Point;
import com.github.arkainnihx.physics.library.PhysicsObject;
import com.github.arkainnihx.physics.library.Universe;

public class SimTick extends TimerTask {
	
	private Universe myUniverse;
	
	public SimTick(Universe un) {
		myUniverse = un;
	}
	
	@Override
	public void run() {
		for (Point element: myUniverse.getShapeList()) {
			if (element instanceof PhysicsObject) {
				((PhysicsObject) element).onTick();
			}
		}
	}
}