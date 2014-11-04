package com.github.arkainnihx.physics.actor;

import com.github.arkainnihx.physics.library.Universe;
import com.github.arkainnihx.physics.library.Vector;

public class Circle extends Particle {
	protected double radius;
	
	public Circle(Vector initialPosition, Double mass, Double radius, Universe myUniverse) {
		super(initialPosition, mass, myUniverse);
		this.radius = radius;
	}
	
	public boolean collisionDetected(Vector testCoord) {
		Vector testDisplacement = new Vector(new double[] {displacement.getComponent(0) - testCoord.getComponent(0), displacement.getComponent(1) - testCoord.getComponent(1)});
		return testDisplacement.getMod() <= radius;
	}

}
