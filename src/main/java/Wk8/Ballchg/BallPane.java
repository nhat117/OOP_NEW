package Wk8.Ballchg;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.lang.reflect.Array;
import java.util.ArrayList;

//Model for cir
public class BallPane extends Pane {
    private final Circle cir;
    public ArrayList <Button> listButt;

    public BallPane(double x, double y, double radius) {
        cir = new Circle(x,y,radius);
        getChildren().add(cir);
        HBox butt = new HBox();
        listButt = createButtList();

        cir.setStroke(Color.BLACK);
        cir.setFill(Color.WHITE);
    }

    private ArrayList<Button> createButtList() {
        ArrayList<Button> tmp = new ArrayList<>();
        tmp.add(new Button("Left"));
        tmp.add(new Button("Right"));
        tmp.add(new Button("Up"));
        tmp.add(new Button("Down"));
        return tmp;
    }

    public HBox buttBOX() {
        HBox butt = new HBox();
        butt.getChildren().addAll(this.listButt);
        butt.setAlignment(Pos.BOTTOM_CENTER);
        butt.setSpacing(10);
        return butt;
    }

    public ArrayList<Button> getListButt() {
        return listButt;
    }
//Action pf the vlaa
    public void moveUp() {
        if (cir.getCenterY() - cir.getRadius() - 10 < 0)
            return;
        cir.setCenterY(cir.getCenterY() - 10);
    }

    public void moveDown() {
        if (cir.getCenterY() + cir.getRadius() + 10 > getHeight())
            return;
        cir.setCenterY(cir.getCenterY() + 10);
    }

    public void moveLeft() {
        if (cir.getCenterX() - cir.getRadius() - 10 < 0)
            return;
        cir.setCenterX(cir.getCenterX() - 10);
    }

    public void moveRight() {
        if (cir.getCenterX() + cir.getRadius() + 10 > getWidth())
            return;
        cir.setCenterX(cir.getCenterX() + 10);
    }
}

