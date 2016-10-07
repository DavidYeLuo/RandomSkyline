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
	public Star(int ix, int iy, Color color, int iwidth, int iheight) {
		x = ix;
		y = iy;
		this.color = color;
		width = iwidth;
		height = iheight;
	}
	
	
	
	//--------------------------------------------------------------------
	//	 Draws the star in the specified graphics context.
	//--------------------------------------------------------------------
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, width, height);
	}
	
	//--------------------------------------------------------------------
	//	 width accessor
	//--------------------------------------------------------------------
	public int getWidth() {
		return width;
	}
	
	//--------------------------------------------------------------------
	//	 width mutator
	//--------------------------------------------------------------------
	public void setWidth(int inum) {
		width = inum;
	}
	
	//--------------------------------------------------------------------
	//	 height accessor
	//--------------------------------------------------------------------
	public int getHeight() {
		return height;
	}
	
	//--------------------------------------------------------------------
	//	 height mutator
	//--------------------------------------------------------------------
	public void setHeight(int inum) {
		height = inum;
	}
	
	//--------------------------------------------------------------------
	//	 x accessor
	//--------------------------------------------------------------------
	public int getX() {
		return x;
	}
	
	//--------------------------------------------------------------------
	//	 x mutator
	//--------------------------------------------------------------------
	public void setX(int inum) {
		x = inum;
	}
	
	//--------------------------------------------------------------------
	//	 y accessor
	//--------------------------------------------------------------------
	public int getY() {
		return y;
	}
	
	//--------------------------------------------------------------------
	//	 y mutator
	//--------------------------------------------------------------------
	public void setY(int inum) {
		y = inum;
	}
}
