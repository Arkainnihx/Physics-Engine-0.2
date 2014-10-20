package com.github.arkainnihx.physics.time;

import java.util.TimerTask;

import com.github.arkainnihx.physics.library.Universe;

public class MonitorTick extends TimerTask {
	
	private Universe myUniverse;
	
	public MonitorTick(Universe un) {
		myUniverse = un;
	}
	
	@Override
	public void run() {
		for (int count = 0; count < myUniverse.getShapeList().size(); count++) {
			System.out.println("Shape " + String.valueOf(count));
			System.out.println(String.valueOf(myUniverse.getShapeList().get(count).getPosition().getComponent(0)));
			System.out.println(String.valueOf(myUniverse.getShapeList().get(count).getPosition().getComponent(1)));
		}
	}
}