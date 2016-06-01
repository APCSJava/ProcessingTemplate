package yourpackage;

import processing.core.PApplet;

/*** 
 * When working with Processing in Eclipse:
 * - download the Processing IDE because it contains the core libraries
 * - in Project Properties, click Add External JARs and then locate core.jar
 * - rename this class and its package to something suitable for your project
 * - update the values in the call to PApplet.main() with the new package and class
 * 
 * @version June 1, 2016
 *
 */

public class YourPApplet extends processing.core.PApplet {

	public static void main(String args[]) {
		// Call the main method as implemented in PApplet, passing your class and package
		// When you change the package and class names, update the following line
		PApplet.main(new String[] { "yourpackage.YourPApplet" });
		// Alternatively, start in presentation mode
		// PApplet.main(new String[] {"--present", "yourpackage.YourPApplet" });
	}

	 //Settings are configured before setup is called.
	public void settings() {
		size(640, 480);
	}

	//Setup is called once when a sketch is initialized
	public void setup() {
	}

	// Draw is called repeatedly at the sketch frame rate
	public void draw() {
	}

	// Called whenever a key press is detected.
	public void keyPressed() {
	}

	// Called whenever a mouse press is detected.
	public void mousePressed() {
	}
	
	// Other methods from PApplet may be overridden, as well
}
