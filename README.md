# ProcessingTemplate
Starter code for Processing projects.  In order to compile, you must verify that 
the Java archive "core.jar" has been added to the build path. See the 
installation-images folder for some example screenshots using Eclipse.  For IntelliJ, 
go to File > ProjectStructure ... > Libraries and add core.jar.
If you haven't already downloaded Processing from their website, you can simply add a Maven
directive to download the module as part of the build process.

# Maven Libraries for Processing
Processing is tested for compatibility with Java 8 (that's Java version 1.8, not 18).
If you would like to use Java/IntelliJ as your editor, that's fine but set the JDK and Language specs to 1.8.

# Points to consider
* Your class must import processing.core.PApplet
* Your class must extend the PApplet class
* The main method simply passes the name of your class to PApplet.main().  If you later
change the name of your class, you will need to update the name of the string provided here.
`PApplet.main(new String[] {"yourSketchClass" });`
* If you'd like your sketch to open in Present mode, change this to 
`PApplet.main(new String[] {"--present", "yourSketchClass" });`

