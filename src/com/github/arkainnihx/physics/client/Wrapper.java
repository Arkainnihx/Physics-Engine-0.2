package com.github.arkainnihx.physics.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.github.arkainnihx.physics.client.gui.GuiFrame;
import com.github.arkainnihx.physics.library.Universe;

public class Wrapper {

	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		Universe myUniverse = new Universe(2);
		GuiFrame myGuiFrame = new GuiFrame();
		myGuiFrame.setVisible(true);
		Universe.listShapes();
		myUniverse.addShape();
		myUniverse.startSim();
		
		try {
		    Thread.sleep(10000);                 
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		myUniverse.stopSim();
		System.exit(0);
	}
	
	public static String getUserInput() throws IOException {
		String inputString;
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		inputString = userInput.readLine();
		return inputString;
	}

}