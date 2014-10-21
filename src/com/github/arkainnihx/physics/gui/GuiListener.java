package com.github.arkainnihx.physics.gui;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JMenuItem;

import com.github.arkainnihx.physics.Wrapper;

public enum GuiListener implements Action {
	
	QUIT("Quit") {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	},
	
	PAUSE("Pause") {
		@Override
		public void actionPerformed(ActionEvent e) {
			Wrapper.myUniverse.stopSim();
		}
	},
	
	RESUME("Resume") {
		@Override
		public void actionPerformed(ActionEvent e) {
			Wrapper.myUniverse.startSim();
		}
	};
	
	private String name;
	
	private GuiListener(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public JMenuItem getMenuItem() {
		JMenuItem item = new JMenuItem(this.getName());
		item.addActionListener(this);
		return item;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
