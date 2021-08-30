package Wk9.Lab1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;

public class Ex1Controller {
    //Distence btw border of a pane
    private static final int DIST = 5;
    @FXML
    private Circle cir;

    @FXML
    private StackPane pane;

    @FXML
    private Button shrink;

    @FXML
    private Button enlarge;

    @FXML
    private void click(ActionEvent e) {
        Object src = e.getSource();
        if((Button) src == enlarge) {
            cir.setRadius(cir.getRadius() - DIST > 0 ? cir.getRadius() - DIST : cir.getRadius());
        } else {
            if ((cir.getRadius() + DIST) * 2 < pane.getHeight() && ((cir.getRadius() + DIST) * 2) < pane.getWidth()) {
                cir.setRadius(cir.getRadius() + DIST);
            }
        }
    }
}
