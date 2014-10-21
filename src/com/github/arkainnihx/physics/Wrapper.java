package com.github.arkainnihx.physics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.github.arkainnihx.physics.gui.GuiFrame;
import com.github.arkainnihx.physics.gui.Window;
import com.github.arkainnihx.physics.library.Universe;

public class Wrapper {

	public static Universe myUniverse;
	
	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		
		@SuppressWarnings("unused")
		GuiFrame mainWindow = new GuiFrame(Window.MAIN).init();
		
		myUniverse = new Universe(2);
		Universe.listShapes();
		myUniverse.addShape();
		myUniverse.startSim();
		try {
		    Thread.sleep(10000);                 
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		myUniverse.stopSim();
	}
	
	public static String getUserInput() throws IOException {
		String inputString;
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		inputString = userInput.readLine();
		return inputString;
	}

}