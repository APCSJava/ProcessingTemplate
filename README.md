# ProcessingTemplate
Starter code for Processing projects.  In order to compile, you must verify that 
the Java archive "core.jar" has been added to the build path. See the 
installation-images folder for some example screenshots using Eclipse.  For IntelliJ, 
go to File > ProjectStructure ... > Libraries and add core.jar.

# Points to consider
* Your class must import processing.core.PApplet
* Your class must extend the PApplet class
* The main method simply passes the name of your class to PApplet.main().  If you later
change the name of your class, you will need to update the name of the string provided here.
`PApplet.main(new String[] {"yourSketchClass" });`
* If you'd like your sketch to open in Present mode, change this to 
`PApplet.main(new String[] {"--present", "yourSketchClass" });`

