
// Exercise 15.19 Solution: Saver2.java
// Program simulates a simple screen saver
//Peter Phan 11/30/14
import javax.swing.JFrame;

public class Saver2
{
   public static void main( String args[] )
   {
      // create frame for CharactersJPanel
      JFrame frame = new JFrame( "Screen Saver" );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      SaverJPanel saverJPanel = new SaverJPanel(); 
      frame.add( saverJPanel ); // add charactersJPanel to frame
      frame.setSize( 325, 325 ); // set frame size
      frame.setVisible( true ); // display frame
   } // end main
} // end class Saver2


