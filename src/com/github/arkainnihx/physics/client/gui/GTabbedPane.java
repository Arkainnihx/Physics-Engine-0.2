package com.github.arkainnihx.physics.client.gui;

import java.awt.GridLayout;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class GTabbedPane extends JTabbedPane {

	
	public JComponent spawnTab() {
		JPanel panel = new JPanel(false);
		JLabel label = new JLabel("Empty");
		label.setHorizontalAlignment(JLabel.CENTER);
		panel.setLayout(new GridLayout(1,1));
		panel.add(label);
		return panel;
	}
}
