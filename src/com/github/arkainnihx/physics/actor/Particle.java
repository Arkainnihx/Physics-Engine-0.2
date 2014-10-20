package com.github.arkainnihx.physics.actor;

import java.util.ArrayList;
import java.util.List;

import com.github.arkainnihx.physics.error.DimensionMismatchException;
import com.github.arkainnihx.physics.library.Force;
import com.github.arkainnihx.physics.library.PhysicsObject;
import com.github.arkainnihx.physics.library.Universe;
import com.github.arkainnihx.physics.library.Vector;
import com.github.arkainnihx.physics.type.ForceType;

public class Particle extends Point implements PhysicsObject {
	protected double mass,energyK,energyG = 0D;
	protected List<Force> forceList = new ArrayList<Force>();
	protected Vector resultant,acceleration,momentumL,velocity;
	
	public Particle(Vector initialPosition, Double mass, Universe myUniverse) {
		super(initialPosition, myUniverse);
		this.mass = mass;
		this.resultant = new Force(myUniverse.getDimension(), ForceType.MISC);
		this.acceleration = new Vector(myUniverse.getDimension());
		this.momentumL = new Vector(myUniverse.getDimension());
		this.velocity = new Vector(myUniverse.getDimension());
	}
	
	public void onTick() {
		resultant = getResultant();
		acceleration = Vector.multiply(resultant,1D/mass);
		try {
			velocity = Vector.add(velocity,Vector.multiply(acceleration, 0.05));
			position = Vector.add(position, Vector.add(Vector.multiply(velocity, 0.05), Vector.multiply(acceleration, -0.5*Math.pow(0.05, 2))));
			
		} catch (DimensionMismatchException e) {
			e.printStackTrace();
		}
		momentumL = Vector.multiply(velocity, mass);
		energyK = 0.5 * mass * Math.pow(velocity.getMod(), 2);
	}
	
	private Force getResultant() {
		Force resultant = new Force(myUniverse.getDimension(), ForceType.MISC);
		for(Force element: forceList) {
			try {
				resultant = (Force) Vector.add(resultant,element);
			} catch (DimensionMismatchException e) {
				e.printStackTrace();
			}
		}
		return resultant;
	}
	
}