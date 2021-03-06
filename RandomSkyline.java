/**
 * RandomSkyline --- program to display a pretty skyline
 * @author     David Ye Luo, Kenta Medina
 * @version    1.0
 * @since      2016-10-10
*/

import javax.swing.*;
import java.awt.*;
//--------------------------------------------------------------------
//  1) set background
//  2) draw stars randomly
//  3) draw buildings randomly
//      a) draw windows randomly
//  4) draw a sentence
//--------------------------------------------------------------------

public class RandomSkyline
{
   /**
   * displays the skyline in a JFrame
   * @param arg A string array containing 
   * the command line arguments.
   * @exception Any exception
   * @return No return value.
   */ 

   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Skyline");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new SkylinePanel());

      frame.pack();
      frame.setVisible(true);
   }
}
