package delta.common.utils.gui;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

/**
 * Rectangle graphical object.
 * @author DAM
 */
public class GraphicalRectangle extends GraphicalObject
{
  private Rectangle _rectangle;

  /**
   * Constructor.
   * @param r Rectangle to use as template.
   */
  public GraphicalRectangle(Rectangle r)
  {
    _rectangle=new Rectangle(r);
  }

  @Override
  public void moveTo(int x, int y)
  {
    _rectangle.setLocation(x,y);
  }

  @Override
  public void draw(Graphics g)
  {
    g.drawRect(_rectangle.x,_rectangle.y,_rectangle.width,_rectangle.height);
  }

  @Override
  public Point getOrigin()
  {
    return new Point(_rectangle.x,_rectangle.y);
  }

  @Override
  public Rectangle getBoundingBox()
  {
    return new Rectangle(_rectangle);
  }
}
