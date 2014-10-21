package com.github.arkainnihx.physics.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public enum Window {
	
	MAIN {
		
		@Override
		public Rectangle getDimension() {
			return new Rectangle(1280, 720);
		}
		
		@Override
		public Container setContent(Container pane) {
			pane.setLayout(new BorderLayout());
			pane.add(new JPanel());
			return pane;
		}
		
		@Override
		public JMenuBar getMenuBar() {
			JMenuBar menuBar = new JMenuBar();
			menuBar.setOpaque(true);
			menuBar.setPreferredSize(new Dimension(1280, 20));
			
			JMenu fileMenu = new JMenu("File");
			
				fileMenu.add(GuiListener.QUIT.getMenuItem());
				
			menuBar.add(fileMenu);
			
			JMenu simMenu = new JMenu("Simulation");
				
				simMenu.add(GuiListener.PAUSE.getMenuItem());
				simMenu.add(GuiListener.RESUME.getMenuItem());
			
			menuBar.add(simMenu);
				
			return menuBar;
		}
	},
	
	DIALOG {
		
		@Override
		public Rectangle getDimension() {
			return new Rectangle(480,360);
		}
		
		@Override
		public Container setContent(Container pane) {
			//TODO Set up content adding
			return pane;
		}
	};
	
	public Rectangle getDimension() {
		return null;
	}
	
	public Container setContent(Container pane) {
		return pane;
	}
	
	public JMenuBar getMenuBar() {
		return null;
	}
}
