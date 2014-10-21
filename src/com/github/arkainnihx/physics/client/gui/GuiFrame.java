package com.github.arkainnihx.physics.client.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class GuiFrame extends JFrame {
	
	private static final long serialVersionUID = 12380858475326302L;

	public GuiFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setOpaque(true);
		menuBar.setPreferredSize(new Dimension(0, 20));
		this.setJMenuBar(menuBar);
		
		JPanel masterPane = new JPanel(new GridBagLayout());
		GridBagConstraints cons = new GridBagConstraints();
		cons.fill = GridBagConstraints.BOTH;
		cons.gridx = 0;
		cons.gridy = 0;
		cons.weightx = 1.0;
		cons.weighty = 1.0;
		
		GTabbedPane mainPane = new GTabbedPane();
		mainPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		JComponent panel = mainPane.spawnTab();
		mainPane.addTab("Nothing", panel);
		
		mainPane.setOpaque(true);
		masterPane.add(mainPane, cons);
		
		this.getContentPane().add(masterPane);
		this.pack();
		this.setVisible(true);
	}
}
