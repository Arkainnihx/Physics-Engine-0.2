package com.github.arkainnihx.physics.library;

import com.github.arkainnihx.physics.actor.Actor;

public class Force extends Vector {
	
	private Actor[] children = new Actor[2];
	
	public Force(double[] elem) {
		super(elem);
	}
	
	public Force(int dimension) {
		super(dimension);
	}
	
	public void applyOverTime(double deltaTInSeconds) {
		children[0].applyForce(Vector.multiply(this, deltaTInSeconds));
	}
}
