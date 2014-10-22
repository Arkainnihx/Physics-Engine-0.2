package com.github.arkainnihx.physics.client.gui;

import java.awt.BorderLayout;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GuiFrame extends JFrame {
	int screenWidth = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getWidth();
	int screenHeight = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getHeight();
	int frameWidth = 900;
	int frameHeight = 600;
	
	public GuiFrame() {
		JPanel contentPane = new JPanel(new BorderLayout());
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu simulationMenu = new JMenu("Simulation");
		JMenuItem quitItem = new JMenuItem("Quit");
		
		this.setBounds((screenWidth-frameWidth)/2, (screenHeight-frameHeight)/2, frameWidth, frameHeight);
		
		
		fileMenu.add(quitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(simulationMenu);
		
		this.setJMenuBar(menuBar);
		this.setContentPane(contentPane);
	}
	
}
