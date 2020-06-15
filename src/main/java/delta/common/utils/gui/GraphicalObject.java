package delta.common.utils.gui;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

/**
 * Base class for graphical objects.
 * @author DAM
 */
public abstract class GraphicalObject
{
  /**
   * Draw this object using the given graphics.
   * @param g Graphics to use.
   */
  public abstract void draw(Graphics g);

  /**
   * Move this object (its origin) to the given location.
   * @param x X position.
   * @param y Y position.
   */
  public abstract void moveTo(int x, int y);

  /**
   * Get the origiin of this object.
   * @return A position (defaut is the top/left of the bounding box).
   */
  public Point getOrigin()
  {
    Rectangle r=getBoundingBox();
    return new Point(r.x,r.y);
  }

  /**
   * Get the bounding box of this object.
   * @return a bounding box.
   */
  public abstract Rectangle getBoundingBox();
}
