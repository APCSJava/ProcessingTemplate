# ProcessingTemplate
Starter code for Processing projects.  In order to compile, you must verify that 
the Java archive "core.jar" has been added to the build path. See the 
installation-images folder for some example screenshots using Eclipse.

# Points to consider
* Your class must import processing.core.PApplet
* Your class must extend the PApplet class
* The `main()` method calls PApplet.main() passing the name of your class in a String[].  If you
change the name of your class later, you will need to change the name of the string provided here.
`PApplet.main(new String[] {"yourSketchClass" });`
* If you'd like your sketch to open in Present mode, change this to 
`PApplet.main(new String[] {"--present", "yourSketchClass" });`

