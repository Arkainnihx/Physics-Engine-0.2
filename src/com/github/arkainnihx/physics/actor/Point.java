package com.github.arkainnihx.physics.actor;

import com.github.arkainnihx.physics.library.Universe;
import com.github.arkainnihx.physics.library.Vector;

public class Point implements Actor {
	
	protected Vector initialPosition;
	protected Vector displacement;
	protected Universe myUniverse;
	
	public Point(Vector init, Universe myUniverse) {
		this.myUniverse = myUniverse;
		this.initialPosition = init;
		this.displacement = initialPosition.clone();
	}
	
	public Point(Universe myUniverse) {
		this(new Vector(new double[]{0D,0D}), myUniverse);
	}
	
	public Vector getPosition() {
		return this.displacement;
	}
	
	public Point setPosition(Vector newPosition) {
		displacement = newPosition;
		return this;
	}
	
	public Vector getInitialPosition() {
		return initialPosition;
	}
	
	public Point setInitialPosition(Vector newPosition) {
		initialPosition = newPosition;
		return this;
	}

	@Override
	public void applyForce(Vector impulse) {
		
	}

	@Override
	public void onTick() {

	}
}