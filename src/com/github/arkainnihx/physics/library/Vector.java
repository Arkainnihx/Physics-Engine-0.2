package com.github.arkainnihx.physics.library;

import com.github.arkainnihx.physics.error.DimensionMismatchException;

public class Vector {
	private double[] components;
	
	public Vector(double[] elem) {
		components = elem;
	}
	
	public Vector(int dimension) {
		this(new double[dimension]);
	}
	
	public static Vector add(Vector op1, Vector op2) throws DimensionMismatchException {
		if (op1.getDimension() != op2.getDimension()) {
			throw new DimensionMismatchException();
		}
		Vector result = new Vector(op1.getDimension());
		for (int i = 0; i < result.getDimension(); i++){
			result.setComponent(i, op1.getComponent(i)+op2.getComponent(i));
		}
		return result;
	}
	
	public static Vector multiply(Vector op1, Double op2) {
		Vector result = new Vector(op1.getDimension());
		for (int i = 0; i < result.getDimension(); i++){
			result.setComponent(i, op1.getComponent(i)*op2);
		}
		return result;
	}
	
	public static Vector normalise(Vector op) {
		return Vector.multiply(op, 1/op.getMod());
	}
	
	public Vector setComponent(int index, Double value) {
		this.components[index] = value;
		return this;
	}
	
	public Double getComponent(int index) {
		return this.components[index];
	}
	
	public Double getMod() {
		Double sum = 0D;
		for (Double element : components) {
			sum += Math.pow(element, 2);
		}
		return Math.sqrt(sum);
	}
	
	public Double getAngleToXPlane() {
		if (components.length == 2) {
			if (getComponent(0) == 0D) {
				if (getComponent(1) > 0D) {
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
	
	public int getDimension() {
		return components.length;
	}
	
	@Override
	public Vector clone() {
		return new Vector(this.components.clone());
	}
}