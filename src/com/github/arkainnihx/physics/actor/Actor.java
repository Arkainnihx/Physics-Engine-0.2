package com.github.arkainnihx.physics.actor;

import com.github.arkainnihx.physics.library.Vector;

public interface Actor {

	public void onTick();
	
	public void applyForce(Vector impulse);

	public Vector getPosition();

}
