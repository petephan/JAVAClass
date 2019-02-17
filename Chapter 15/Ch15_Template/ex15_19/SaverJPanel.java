// Exercise 15.19 Solution: SaverJPanel.java
// Program simulates a simple screen saver
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SaverJPanel extends JPanel implements ActionListener
{
   // random-number generator
   private static final Random random = new Random();
   private Timer timer;

   // constructor sets window's title bar string and dimensions
   public SaverJPanel()
   {
      timer = new Timer( 1000, this ); // create the timer, every 1000 milliseconds, the timer triggers an event on the panel
      timer.start();
   } // end SaverJPanel constructor

   // draw lines 
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      int x, y, x1, y1;

     //TO DO:
	 //Use for loop to draw 100 lines
		//select x, y, x1, y1 coordinates to be random numbers between 0 and 300
		//set color to be random RGB value
		//call graphics draw line between point (x,y) and point(x1, y1)

   } // end method paintComponent

   // repaint JPanel
   public void actionPerformed( ActionEvent actionEvent )
   {
      repaint();
   } // end method actionPerformed
} // end class SaverJPanel


