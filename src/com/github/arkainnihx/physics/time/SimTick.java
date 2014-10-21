package com.github.arkainnihx.physics.time;

import java.util.TimerTask;

import com.github.arkainnihx.physics.actor.Actor;
import com.github.arkainnihx.physics.library.Universe;

public class SimTick extends TimerTask {
	
	private Universe myUniverse;
	private boolean isRunning;
	
	public SimTick(Universe un, boolean startPaused) {
		myUniverse = un;
		isRunning = !startPaused;
	}
	
	public SimTick(Universe un) {
		this(un, false);
	}
	
	@Override
	public void run() {
		if (isRunning) {
			for (Actor element : myUniverse.getShapeList()) {
				if (element instanceof Actor) {
					((Actor) element).onTick();
				}
			}
		}
	}
	
	public void pauseSim() {
		isRunning = false;
	}
	
	public void resumeSim() {
		isRunning = true;
	}
}