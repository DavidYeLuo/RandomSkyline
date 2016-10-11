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
    private Building building1; //instantiate
    private Star shinyThing;
   //-------------------------------------------------
   //   Default Constructor: Sets up the Panel
   //-------------------------------------------------
   public SkylinePanel()
   {  
      setPreferredSize (new Dimension(600, 400));
      setBackground (new Color(255,255,255));
   }
   //-------------------------------------------------
   //   Draws the Panel
   //-------------------------------------------------
   public void paintComponent (Graphics page)
   {

      super.paintComponent(page);
      for(int i = 0; i < 100; i++){
        shinyThing = new Star((int)(Math.random()*600),
                              (int)(Math.random()*380),
                               Color.black, 5, 5);
        shinyThing.draw(page);
      }

      page.setColor(Color.black);  // moon
      page.fillOval(50,70,40,40);  // moon
      
      page.setColor(new Color(0,0,0));   // far background building
      for(int i = 0; i < 40; i++){
         page.fillRect((int)(Math.random()*680-40),  // far background building
                       (int)(Math.random()*20+360),  // far background building
                       (int)(Math.random()*20+40),   // far background building
                        40);                         // far background building
      }
      
      page.setColor(new Color(0,0,0));  // ground  color
      page.fillRect(0,380,600,20);      // ground

      int index = 0; // initialized
      index += (int)(Math.random()*10+15); // changed from 0 to random 34
      while (index <= 500){                         // draws randomly-sized buildings and randomly-sized gaps
      
        int leWidth = (int)(Math.random()*30+60);   // Building's width
        
        building1 = new Building(index, 380,       // Building's Location
                                 new Color(0,0,0),  // Black color
                                 leWidth,
                                 (int)(Math.random()*100+150));  // Building's height
                                
        building1.draw(page);
        
        index += leWidth;   // update index
        index += (int)(Math.random()*20+20); // ???
      }
      
      page.setColor (Color.black);  // string color
      page.drawString("Welcome to David Ye Luo and Kenta Medina's City, shown here in an artist's depiction", 30, 30); // draw string
   }
}
