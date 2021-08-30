package Wk9.Lab2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Bounds;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class Ex2Controller {

    //Distence btw border of a pane
    private static final int DIST = 5;
//FXML Declaration
    @FXML
    private Pane pane;

    @FXML
    private Circle cir;

    @FXML
    private Button left;

    @FXML
    private Button right;

    @FXML
    private Button up;

    @FXML
    private Button down;

    @FXML
    private void click(ActionEvent e) {
        Bounds bounds = pane.getLayoutBounds();
        Object src = e.getSource();
        if ((Button) src == up) {
            if (cir.getCenterY() - DIST > (bounds.getMinY() + cir.getRadius())) {
                cir.setCenterY(cir.getCenterY() - 10);
            }
            System.out.println("Up Button Pressed");
        } else if ((Button) src == down) {
            if (cir.getCenterY() + DIST < (bounds.getMaxY() - cir.getRadius())) {
                cir.setCenterY(cir.getCenterY() + 10);
            }
            System.out.println("Down Button Pressed");
        } else if ((Button) src == right) {
            if (cir.getCenterX() + DIST < (bounds.getMaxX() - cir.getRadius())) {
                cir.setCenterX(cir.getCenterX() + 10);
            }
            System.out.println("Right Button Pressed");
        } else {
            if (cir.getCenterX() - DIST > (bounds.getMinX() + cir.getRadius())) {
                cir.setCenterX(cir.getCenterX() - 10);
            }
            System.out.println("Left Button Pressed");
        }
    }
}


