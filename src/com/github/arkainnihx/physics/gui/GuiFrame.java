package com.github.arkainnihx.physics.gui;

import javax.swing.JFrame;

public class GuiFrame extends JFrame implements Runnable {

	private Window windowType;
	
	private static final long serialVersionUID = -4396658130826116931L;

	public GuiFrame(Window type) {
		super("Arkainnihx Physics Simulator");
		windowType = type;
		this.setBounds(type.getDimension());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setJMenuBar(type.getMenuBar());
		this.setContentPane(type.setContent(this.getContentPane()));
	}
	
	public GuiFrame init() {
		javax.swing.SwingUtilities.invokeLater((Runnable) this);
        return this;
	}

	@Override
	public void run() {
		this.setVisible(true);
	}
	
	public GuiFrame resize() {
		this.setBounds(windowType.getDimension());
		return this;
	}
}
