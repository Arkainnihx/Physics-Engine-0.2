package com.github.arkainnihx.physics.library;

public class Point {
	
	private Vector initialPosition;
	private Vector position;
	
	public Point(Vector init) {
		this.initialPosition = init;
		this.position = initialPosition.clone();
	}
	
	public Point() {
		this(new Vector(new Double[]{0D,0D}));
	}
	
	public Vector getPosition() {
		return this.position;
	}
	
	public Point setPosition(Vector newPosition){
		position = newPosition;
		return this;
	}
	
	public Vector getInitialPosition(){
		return initialPosition;
	}
	
	public Point setInitialPosition(Vector newPosition){
		initialPosition = newPosition;
		return this;
	}
}