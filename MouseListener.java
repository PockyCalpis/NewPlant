package newPlant;

import java.awt.event.MouseEvent;

/**
 * MouseListener
 * @version 1.0
 * @author Phoebe
 * Mouse Listener to track mouse operations in window
 */

public interface MouseListener {

    /**
     * checks whether mouse is clicked
     * @param mouseEvent event indicating Mouse has taken action
     */
    void mouseClicked(MouseEvent mouseEvent);

    /**
     * checks whether mouse has entered component
     * @param mouseEvent event indicating Mouse has taken action
     */
    void mouseEntered(MouseEvent mouseEvent);

    /**
     * checks whether mouse is pressed
     * @param mouseEvent event indicating Mouse has taken action
     */
    void mousePressed(MouseEvent mouseEvent);

    /**
     * checks whether mouse is released
     * @param mouseEvent event indicating Mouse has taken action
     */
    void mouseReleased(MouseEvent mouseEvent);

    /**
     * checks whether mouse has exited a component
     * @param mouseEvent event indicating Mouse has taken action
     */
    void mouseExited(MouseEvent mouseEvent);
}
