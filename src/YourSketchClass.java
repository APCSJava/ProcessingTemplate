
import processing.core.PApplet;

/***
 * Builds a sketch by extending the PApplet class. In order for this to work,
 * the core Processing libraries must be available on the build path -- these
 * are located in a Java archive called "core.jar" which is distributed as part
 * of the Processing IDE. Look for Processing>Contents>Java>core.jar
 *
 */

public class YourSketchClass extends processing.core.PApplet {

	public static void main(String args[]) {
		PApplet.main(new String[] { "YourSketchClass" });
	}

	/**
	 * This method is called before setup() is run. Set size here, rather than in
	 * setup.
	 */
	public void settings() {
		size(800, 600);
	}

	/**
	 * This method is called after settings(). Use this method to initialize any
	 * variables or data structures, load fonts, load images, load sounds, etc.
	 */
	public void setup() {
	}

	/**
	 * This method is called once every frame. If doing animation, include all
	 * commands necessary to build the image for display.
	 */
	public void draw() {
	}

	/**
	 * When the operating system detects a key press, it executes this method. Avoid
	 * putting drawing commands in here. Instead, use this method to modify
	 * variables that are referenced by draw().
	 */
	public void keyPressed() {
	}

	/**
	 * When the operating system detects a mouse press, it executes this method.
	 * Avoid putting drawing commands in here. Instead, use this method to modify
	 * variables that are referenced by draw().
	 */
	public void mousePressed() {
	}

	/**
	 * See the PApplet documentation to discover other methods that can be overridden.
	 */
}
