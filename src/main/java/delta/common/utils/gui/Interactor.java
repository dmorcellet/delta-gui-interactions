package delta.common.utils.gui;

import java.awt.event.MouseEvent;

/**
 * Interface of an interactor.
 * @author DAM
 */
public interface Interactor
{
  /**
   * Handle a 'mouse pressed' event.
   * @param event Source event.
   * @return <code>true</code> if event was handled, <code>false</code> otherwise.
   */
  boolean handleMousePressed(MouseEvent event);

  /**
   * Handle a 'mouse dragged' event.
   * @param event Source event.
   * @return <code>true</code> if event was handled, <code>false</code> otherwise.
   */
  boolean handleMouseDragged(MouseEvent event);

  /**
   * Handle a 'mouse released' event.
   * @param event Source event.
   * @return <code>true</code> if event was handled, <code>false</code> otherwise.
   */
  boolean handleMouseReleased(MouseEvent event);
}
