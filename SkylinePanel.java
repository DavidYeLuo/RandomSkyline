/**
 * SkylinePanel --- program to draw buildings
 * @author          David Ye Luo, Kenta Medina
 * @version         1.0
 * @since           2016-10-10 
*/

import javax.swing.*;
import java.awt.*;
import java.lang.*;

public class SkylinePanel extends JPanel
{
   //-------------------------------------------------
   //   Default Constructor: Sets up the Panel
   //-------------------------------------------------
   public SkylinePanel()
   {  
      setPreferredSize (new Dimension(600, 400));
      setBackground (Color.gray);
   }
   //-------------------------------------------------
   //   Draws the Panel
   //-------------------------------------------------
   public void paintComponent (Graphics page)
   {

      super.paintComponent(page);
      for(int i = 0; i < 100; i++){  // stars
        Star shinyThing = new Star((int)(Math.random()*600),  // x location of stars
                                   (int)(Math.random()*380),  // y location of stars
                                    Color.yellow, 5, 5);      // color and sizes of stars
        shinyThing.draw(page);
      }

      page.setColor(Color.lightGray);  // moon
      page.fillOval(40,60,60,60);      // moon
      
      page.setColor(new Color(224,255,255));  // far background building
      for(int i = 0; i < 40; i++){
         page.fillRect((int)(Math.random()*680-40),  // far background building
                       (int)(Math.random()*20+360),  // far background building
                       (int)(Math.random()*20+40),   // far background building
                        40);                         // far background building
      }
      
      page.setColor(new Color(139,69,19));  // ground color
      page.fillRect(0,380,600,20);  // ground

      int index = (int)(Math.random()*10+15);  // 0 inclusive to 35 exclusive
      while (index < 500)  // draws randomly-sized buildings and randomly-sized gaps
      {                         
        int randWidth = (int)(Math.random()*30+60);
        int randHeight = (int)(Math.random()*100+150);
        int gap = (int)(Math.random()*20+20);
        
        Building building = new Building(index, 380,  // Building's Location
                                 Color.cyan,  // Black color
                                 randWidth,
                                 randHeight);
        building.draw(page);
        
        index += randWidth;  // update index
        index += gap;        // update index
      }
      
      page.setColor (Color.black);  // string color
      page.drawString("Welcome to David Ye Luo and Kenta Medina's City, shown here in an artist's depiction", 30, 30); // draw string
   }
}
