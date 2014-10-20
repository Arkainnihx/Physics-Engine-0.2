package com.github.arkainnihx.physics.library;

import com.github.arkainnihx.physics.type.ForceType;

public class Force extends Vector {
	
	private ForceType forceType;
	
	public Force(double[] elem, ForceType type) {
		super(elem);
		this.forceType = type;
	}
	
	public Force(int dimension, ForceType type) {
		super(dimension);
		this.forceType = type;
	}
	
	public boolean isOfType(ForceType type){
		return (this.forceType == type);
	}
}
