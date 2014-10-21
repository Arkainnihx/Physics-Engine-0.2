package com.github.arkainnihx.physics.library;

import com.github.arkainnihx.physics.actor.Actor;

public class Force extends Vector {
	
	private boolean perma;
	private double time;
	private Actor[] children = new Actor[2];
	
	public Force(double[] elem, boolean permanent) {
		super(elem);
		this.perma = permanent;
	}
	
	public Force(int dimension, boolean permanent) {
		super(dimension);
		this.perma = permanent;
	}
	
	public boolean isPermaForce() {
		return this.perma;
	}
	
	public void applyOverTime(double deltaT) {
		children[0].applyImpulse(Vector.multiply(this, deltaT));
	}
}
