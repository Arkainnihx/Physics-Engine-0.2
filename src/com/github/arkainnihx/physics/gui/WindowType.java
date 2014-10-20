package com.github.arkainnihx.physics.gui;

import java.awt.Rectangle;

public enum WindowType {
	MAIN {
		@Override
		public Rectangle getDimension() {
			return new Rectangle(1280, 720);
		}
	},
	
	DIALOG {
		@Override
		public Rectangle getDimension() {
			return new Rectangle(480,360);
		}
	};
	
	public abstract Rectangle getDimension();
}
