package com.github.arkainnihx.physics.library;

public class Point {
	
	protected Vector initialPosition;
	protected Vector position;
	protected Universe myUniverse;
	
	public Point(Vector init, Universe myUniverse) {
		this.myUniverse = myUniverse;
		this.initialPosition = init;
		this.position = initialPosition.clone();
	}
	
	public Point(Universe myUniverse) {
		this(new Vector(new double[]{0D,0D}), myUniverse);
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