package com.github.arkainnihx.physics.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Universe {
	private int dimension = 0;
	private List<PhysicsObject> shapeList = new ArrayList<PhysicsObject>();
	private Timer time = new Timer();
	private int tickPeriod = 20;
	
	public Universe(int value) {
		dimension = value;
	}
	
	public void startSim() {
		time.scheduleAtFixedRate(new TimerTask() { 
			@Override
			public void run() { 
				tick();
			}
		}, 0, tickPeriod);
	}
	
	public void stopSim() {
		
	}
	
	public void tick() {
		for (PhysicsObject element: shapeList) {
			element.onTick();
		}
	}
	
}
