package com.github.arkainnihx.physics.actor;

import java.util.ArrayList;
import java.util.List;

import com.github.arkainnihx.physics.error.DimensionMismatchException;
import com.github.arkainnihx.physics.library.Force;
import com.github.arkainnihx.physics.library.PhysicsObject;
import com.github.arkainnihx.physics.library.Universe;
import com.github.arkainnihx.physics.library.Vector;

public class Particle extends Point implements PhysicsObject {
	protected double mass,energyK,energyG = 0D;
	protected List<Force> forceList = new ArrayList<Force>();
	protected Vector resultant,acceleration,momentumL,velocity;
	
	public Particle(Vector initialPosition, Double mass, Universe myUniverse) {
		super(initialPosition, myUniverse);
		this.mass = mass;
		this.acceleration = new Vector(myUniverse.getDimension());
		this.momentumL = new Vector(myUniverse.getDimension());
		this.velocity = new Vector(myUniverse.getDimension());
	}
	
	public void onTick() {
		try {
			velocity = Vector.multiply(momentumL, 1D/mass);
			position = Vector.add(position, Vector.add(Vector.multiply(velocity, 0.05), Vector.multiply(acceleration, -0.5*Math.pow(0.05, 2))));
			
		} catch (DimensionMismatchException e) {
			e.printStackTrace();
		}
		energyK = 0.5 * mass * Math.pow(velocity.getMod(), 2);
	}
	
	@Override
	public void applyImpulse(Vector impulse) {
		try {
			momentumL = Vector.add(momentumL, impulse);
		} catch (DimensionMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}