package com.github.arkainnihx.physics;

import com.github.arkainnihx.physics.library.Vector;

public class Wrapper {

	public static void main(String[] args) {
			Vector vector1 = new Vector(new Double[]{0D,-1D});
			System.out.println(vector1.getMod());
			System.out.println(vector1.getAngleToXPlane());
			System.out.println(vector1.getComponent(0));
			System.out.println(vector1.getComponent(1));
	}

}
