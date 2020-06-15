package delta.common.utils.gui;

import java.awt.event.MouseEvent;

/**
 * Default base class for Interactors.
 * @author DAM
 */
public class DefaultInteractor implements Interactor
{
  @Override
  public boolean handleMousePressed(MouseEvent event)
  {
    return false;
  }

  @Override
  public boolean handleMouseDragged(MouseEvent event)
  {
    return false;
  }

  @Override
  public boolean handleMouseReleased(MouseEvent event)
  {
    return false;
  }
}
