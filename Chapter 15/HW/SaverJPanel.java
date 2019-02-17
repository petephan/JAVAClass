

// Exercise 15.19 Solution: SaverJPanel.java
// Program simulates a simple screen saver
//Peter Phan 11/30/14
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SaverJPanel extends JPanel implements ActionListener {

    // random-number generator

    private static final Random random = new Random();
    private Timer timer;

    // constructor sets window's title bar string and dimensions
    public SaverJPanel() {
        timer = new Timer(1000, this); // create the timer, every 1000 milliseconds, the timer triggers an event on the panel
        timer.start();
    } // end SaverJPanel constructor

    // draw lines 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x, y, x1, y1;

        for (int i = 0; i < 100; i++) {
            
            x = (int)(Math.random() * 300);
            y = (int)(Math.random() * 300);
            x1 = (int)(Math.random() * 300);
            y1 = (int)(Math.random() * 300);

            g.setColor(new Color(random.nextFloat(), random.nextFloat(), random.nextFloat()));
            g.drawLine(x, y, x1, y1);
        }       
    } // end method paintComponent

    // repaint JPanel
    public void actionPerformed(ActionEvent actionEvent) {
        repaint();
    } // end method actionPerformed
} // end class SaverJPanel

