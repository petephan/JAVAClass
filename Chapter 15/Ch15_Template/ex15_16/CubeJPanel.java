// Exercise 15.16 Solution: CubeJPanel.java
// Program draws a cube.
import java.awt.Color;
import java.awt.geom.GeneralPath;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class CubeJPanel extends JPanel
{
   // draw cube
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );
      
      // base one: coordinates for front of the cube, point 0, 1, 2, 3, 4(same as point 0)
      int base1X[] = { 100, 100, 200, 200, 100 };
      int base1Y[] = { 100, 200, 200, 100, 100 };
      
      // base two: coordinates for back of the cube, point 0, 1, 2, 3, 4(same as point 0)
      int base2X[] = { 75, 75, 175, 175, 75 };
      int base2Y[] = { 75, 175, 175 ,75, 75 };

      Graphics2D g2d = ( Graphics2D ) g;
      g2d.setColor( Color.red );

      GeneralPath cube = new GeneralPath();

      // create path for the cube
	  // Use for loop to move to point i and draw line to point i+1 of front, back and between front and back.
	  


      g2d.draw( cube );
   } // end method paintComponent
} // end class CubeJPanel



