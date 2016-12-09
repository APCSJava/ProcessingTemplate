package org.asl.mobio;

import processing.core.PApplet;
import processing.core.PVector;

public class Chip {

	PVector location;
	int c;
	
	public Chip(PApplet sketch) {
		float x = (float) Math.random()*sketch.width;
		float y = (float) Math.random()*sketch.height;
		location = new PVector(x, y);
		c = (int) (Math.random()*255);
	}
	
	public void draw(PApplet sketch) {
		sketch.fill(0, c, 0);
		sketch.ellipse(location.x, location.y, 10, 10);
	}
	
	public void flit(PApplet sketch) {
		location.x = (float) Math.random()*sketch.width;
		location.y = (float) Math.random()*sketch.height;
	}
	
}
