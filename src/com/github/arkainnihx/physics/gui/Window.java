package com.github.arkainnihx.physics.gui;

import javax.swing.JFrame;

public class Window implements Runnable {
	
	private WindowType type;
	
	public Window(WindowType type) {
		this.type = type;
        javax.swing.SwingUtilities.invokeLater((Runnable) this);
	}
	
	public void run() {
		createWindow(this.type);
	}
	
	private static void createWindow(WindowType type) {
		JFrame frame = new JFrame("Arkainnihx Physics Simulator");
		frame.setBounds(type.getDimension());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}
}
