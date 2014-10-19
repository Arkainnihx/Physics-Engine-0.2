package com.github.arkainnihx.physics.library;

import java.util.ArrayList;
import java.util.List;

import com.github.arkainnihx.physics.error.DimensionMismatchException;

public class Particle extends Point implements PhysicsObject {
	private Double mass,energyK,energyG = 0D;
	private List<Vector> forceList = new ArrayList<Vector>();
	private Vector resultant,acceleration,momentum,velocity;
	
	public Particle(Vector initialPosition, Double mass) {
		super(initialPosition);
		this.mass = mass;
	}
	
	public void onTick() {
		resultant = getResultant();
		acceleration = Vector.multiply(resultant,1D/mass);
		try {
			velocity = Vector.add(velocity,Vector.multiply(acceleration, 0.05));
		} catch (DimensionMismatchException e) {
			e.printStackTrace();
		} 
		//TODO Finish this method
	}
	
	private Vector getResultant() {
		Vector resultant = new Vector(forceList.get(0).getDimension()); //TODO Bit of a hack here, consider cleaning
		for(Vector element: forceList) {
			try {
				resultant = Vector.add(resultant,element);
			} catch (DimensionMismatchException e) {
				e.printStackTrace();
			}
		}
		return resultant;
	}
}
