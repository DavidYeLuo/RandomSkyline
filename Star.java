/**
 * Star --- program to draw star
 * @author  David Ye Luo, Kenta Medina
 * @version 1.0
 * @since   2016-10-06
 */
import java.awt.*;
public class Star {
    private int width;
    private int height;
    private int x;
    private int y;
    private Color color;
	
    //--------------------------------------------------------------------
    //	Constructor: sets up the star based on value
    //--------------------------------------------------------------------
    public Star(int iX, int iY, Color color, int iWidth, int iHeight) 
    {
        x = iX;
        y = iY;
        this.color = color;
        width = iWidth;
        height = iHeight;
    }



    //--------------------------------------------------------------------
    //	 Draws the star in the specified graphics context.
    //--------------------------------------------------------------------
    public void draw(Graphics g) 
    {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
    
    //--------------------------------------------------------------------
    //	 width accessor
    //--------------------------------------------------------------------
    public int getWidth() 
    {
        return width;
    }

    //--------------------------------------------------------------------
    //	 width mutator
    //--------------------------------------------------------------------
    public void setWidth(int iNum) 
    {
        width = iNum;
    }
	
    //--------------------------------------------------------------------
    //	 height accessor
    //--------------------------------------------------------------------
    public int getHeight() 
    {
        return height;
    }

    //--------------------------------------------------------------------
    //	 height mutator
    //--------------------------------------------------------------------
    public void setHeight(int iNum) 
    {
        height = iNum;
    }

    //--------------------------------------------------------------------
    //	 x accessor
    //--------------------------------------------------------------------
    public int getX() 
    {
        return x;
    }

    //--------------------------------------------------------------------
    //	 x mutator
    //--------------------------------------------------------------------
    public void setX(int iNum) 
    {
        x = iNum;
    }

    //--------------------------------------------------------------------
    //	 y accessor
    //--------------------------------------------------------------------
    public int getY() 
    {
        return y;
    }

    //--------------------------------------------------------------------
    //	 y mutator
    //--------------------------------------------------------------------
    public void setY(int iNum) 
    {
        y = iNum;
    }
}
