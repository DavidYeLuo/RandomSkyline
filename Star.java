/**
 * Star --- program to draw star
 * @author  David Ye Luo, Kenta Medina
 * @version 1.0
 * @since   2016-10-10
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
    //	 width mutator
    //--------------------------------------------------------------------
    public void setWidth(int iNum) 
    {
        width = iNum;
    }

    //--------------------------------------------------------------------
    //	 height mutator
    //--------------------------------------------------------------------
    public void setHeight(int iNum) 
    {
        height = iNum;
    }
    
    //--------------------------------------------------------------------
    //	 x mutator
    //--------------------------------------------------------------------
    public void setX(int iNum) 
    {
        x = iNum;
    }
    
    //--------------------------------------------------------------------
    //	 y mutator
    //--------------------------------------------------------------------
    public void setY(int iNum) 
    {
        y = iNum;
    }
    
    //--------------------------------------------------------------------
    //	 Color mutator
    //--------------------------------------------------------------------
    public void setColor(Color color) 
    {
        this.color = color;
    }
    
    //--------------------------------------------------------------------
    //	 width accessor
    //--------------------------------------------------------------------
    public int getWidth() 
    {
        return width;
    }
    
    //--------------------------------------------------------------------
    //	 height accessor
    //--------------------------------------------------------------------
    public int getHeight() 
    {
        return height;
    }

    //--------------------------------------------------------------------
    //	 x accessor
    //--------------------------------------------------------------------
    public int getX() 
    {
        return x;
    }

    //--------------------------------------------------------------------
    //	 y accessor
    //--------------------------------------------------------------------
    public int getY() 
    {
        return y;
    }
    
    //--------------------------------------------------------------------
    //	 width accessor
    //--------------------------------------------------------------------
    public Color getColor() 
    {
        return color;
    }
}
