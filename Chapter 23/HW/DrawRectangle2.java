// Exercise 23.9 Solution: DrawRectangle2.java
// Draws a rectangle on the applet window whose
// dimension and location are specified by the user
// Peter Phan 11/30/14

import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DrawRectangle2 extends JApplet {

    int upperLeftX;
    int upperLeftY;
    int width;
    int height;

    // obtain rectangle dimensions and coordinates from user
    public void init() {
        // string entered by user
        String inputString;

        // read upper left x-value from user
        inputString = JOptionPane.showInputDialog("Enter upper left X :");
        upperLeftX = Integer.parseInt(inputString);

        // read upper right y-value from user
        inputString = JOptionPane.showInputDialog("Enter upper left Y :");
        upperLeftY = Integer.parseInt(inputString);

        // read width from user
        inputString = JOptionPane.showInputDialog("Enter width :");
        width = Integer.parseInt(inputString);

        // read height from user
        inputString = JOptionPane.showInputDialog("Enter height :");
        height = Integer.parseInt(inputString);
    } // end method init

    public void paint(Graphics g) {
        g.drawRect(upperLeftX, upperLeftY, width, height);
    }
} // end class DrawRectangle2

