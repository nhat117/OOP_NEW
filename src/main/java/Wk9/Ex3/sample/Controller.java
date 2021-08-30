package Wk9.Ex3.sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {



    @FXML
    Circle cir1;

    @FXML
    Circle cir2;

    @FXML
    Line line;

    @FXML
    Label lab;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        calc();
    }

    @FXML
    protected void  cirMove(MouseEvent mouse) {
        Object src = mouse.getSource();
        if((Circle) src == cir1) {
            cir1.setCenterX(mouse.getX());
            cir1.setCenterY(mouse.getY());
            line.setStartX(mouse.getX());
            line.setStartY(mouse.getY());
            calc();
            moveLab();
        } else {
            cir2.setCenterX(mouse.getX());
            cir2.setCenterY(mouse.getY());
            line.setEndX(mouse.getX());
            line.setEndY(mouse.getY());
            calc();
            moveLab();
        }
    }

    private void calc() {
        double distance = Math.sqrt(Math.pow(cir1.getCenterX() - cir2.getCenterX(),2)
                + Math.pow(cir1.getCenterY() - cir2.getCenterY(),2));
        lab.setText(Integer.toString((int)distance));
    }

    private void moveLab() {
        double midX = (cir1.getCenterX() + cir2.getCenterX()) /2;
        double midY=(cir1.getCenterY() + cir2.getCenterY()) /2;
        lab.setLayoutX(midX);
        lab.setLayoutY(midY);
    }
}

