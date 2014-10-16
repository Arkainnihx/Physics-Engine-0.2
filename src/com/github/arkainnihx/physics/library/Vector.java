package com.github.arkainnihx.physics.library;

public class Vector {
	private Double[] components;
	
	public Vector(Double[] elem) {
		components = elem;
	}
	
	public Vector(int dimension) {
		this(new Double[dimension]);
	}
	
	public Vector() {
		this(2);
	}
	
	public Vector setComponent(int index, Double value) {
		this.components[index] = value;
		return this;
	}
	
	public Double getComponent(int index){
		return this.components[index];
	}
	
	public Double getMod() {
		Double sum = 0D;
		for (Double element : components){
			sum += Math.pow(element, 2);
		}
		return Math.sqrt(sum);
	}
	
	public Double getAngleToXPlane() {
		if (components.length == 2) {
			if (getComponent(0) == 0D) {
				if (getComponent(1) > 0D){
					return Math.PI*0.5D;
				} else if (getComponent(1) < 0D) {
					return Math.PI*1.5D;
				} else return 0D;
			}
			Double angle = Math.atan(getComponent(1) / getComponent(0));
			if (getComponent(0) >= 0 && getComponent(1) >= 0) {
				return angle;
			} else if (getComponent(0) <= 0 && getComponent(1) >= 0) {
				return angle+Math.PI;
			} else if (getComponent(0) <= 0 && getComponent(1) <= 0) {
				return angle+Math.PI;
			} else if (getComponent(0) >= 0 && getComponent(1) <= 0) {
				return angle+(2*Math.PI);
			}
		}
		//TODO: This method is only implemented for 2D vectors
		return null;
	}
}
