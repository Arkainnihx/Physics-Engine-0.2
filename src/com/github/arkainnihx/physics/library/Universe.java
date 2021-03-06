package com.github.arkainnihx.physics.library;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;

import com.github.arkainnihx.physics.Wrapper;
import com.github.arkainnihx.physics.actor.Actor;
import com.github.arkainnihx.physics.actor.Particle;
import com.github.arkainnihx.physics.actor.Point;
import com.github.arkainnihx.physics.time.*;

public class Universe {
	private Dimension[] dimensionList;
	private ArrayList<Actor> shapeList = new ArrayList<Actor>();
	private Timer time = new Timer();
	private SimTick simTick = new SimTick(this);
	private MonitorTick monitorTick = new MonitorTick(this);
	private int tickPeriod = 20;
	
	public Universe(int value) {
		dimensionList = new Dimension[value];
		for (int count = 0; count < value; count++) {
			dimensionList[count] = Dimension.values()[count];
		}
	}
	
	public void startSim() {
		time.scheduleAtFixedRate(simTick, 0, tickPeriod);
		time.scheduleAtFixedRate(monitorTick, 0, tickPeriod * 50);
	}
	
	public void stopSim() {
		simTick.cancel();
		monitorTick.cancel();
	}
	
	public static void listShapes() {
		System.out.println("0 - Point");
		System.out.println("1 - Particle");
		System.out.println();
	}
	
	public void addShape() throws NumberFormatException, IOException {
		int choice = 0;
		System.out.println("What shape would you like you add?");
		choice = Integer.parseInt(Wrapper.getUserInput());
		switch (choice) {
		case 0 :
			addPoint();
			break;
		case 1 :
			addParticle();
			break;
		}
	}
	
	private void addPoint() throws NumberFormatException, IOException {
		double[] coordList = new double[dimensionList.length];
		for (int count = 0; count < dimensionList.length; count++) {
			System.out.println("Enter " + dimensionList[count].toString() + "-coord:");
			coordList[count] =  Double.parseDouble(Wrapper.getUserInput());
		}
		Point myPoint = new Point(new Vector(coordList), this);	
		shapeList.add(shapeList.size(), myPoint);
	}
	
	private void addParticle() throws NumberFormatException, IOException {
		double[] coordList = new double[dimensionList.length];
		double mass = 0D;
		for (int count = 0; count < dimensionList.length; count++) {
			System.out.println("Enter " + dimensionList[count].toString() + "-coord:");
			coordList[count] = Double.parseDouble(Wrapper.getUserInput());
			System.out.println();
		}
		System.out.print("Enter mass: ");
		mass = Double.parseDouble(Wrapper.getUserInput());
		System.out.println();
		Particle myParticle = new Particle(new Vector(coordList), mass, this);	
		shapeList.add(shapeList.size(), myParticle);
	}
	
	public int getDimension() {
		return dimensionList.length;
	}
	
	public Timer getTime() {
		return time;
	}
	
	public ArrayList<Actor> getShapeList() {
		return shapeList;
	}
}