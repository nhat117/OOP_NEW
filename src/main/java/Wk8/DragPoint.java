package Wk8;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DragPoint extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(MouseDetect(),400,400);
        stage.setScene(scene);
        stage.setTitle("Chart");
        stage.show();
    }

    public Pane MouseDetect() {
        Circle circle1 = new Circle();
        circle1.setCenterX(40);
        circle1.setCenterY(40);
        circle1.setRadius(10);
        circle1.setStroke(Color.BLACK);
        circle1.setFill(Color.WHITE);

        Circle circle2 = new Circle();
        circle2.setCenterX(120);
        circle2.setCenterY(150);
        circle2.setRadius(10);
        circle2.setStroke(Color.BLACK);
        circle2.setFill(Color.WHITE);



        Line line = new Line ();
        Text text = lineBinder(circle1,circle2,line);
        //Bind line to two circle
        return new Pane(circle1,circle2, line, text );
    }

    public  Text  lineBinder(Circle circle1, Circle circle2, Line line) {
        DoubleProperty distanceProperty = new SimpleDoubleProperty();

        ChangeListener<Number> changeListener = (observable, oldValue, newValue) -> {
            Point2D p1 = new Point2D(circle1.getCenterX(), circle1.getCenterY());
            Point2D p2 = new Point2D(circle2.getCenterX(), circle2.getCenterY());
            distanceProperty.set(p1.distance(p2));
        };

        circle1.centerXProperty().addListener( changeListener);
        circle1.centerYProperty().addListener( changeListener);
        circle2.centerXProperty().addListener( changeListener);
        circle2.centerYProperty().addListener( changeListener);

        Text text = new Text();
        text.textProperty().bind(distanceProperty.asString());
        return text;
    }
    //Handling the event
//    public void  Action(Circle circle1, Circle circle2) {
//        circle1.setOnMousePressed(mousePressEventHandler());
//        circle1.setOnMouseDragged(mouseDragEventHandler());
//        circle2.setOnMousePressed(mousePressEventHandler());
//        circle2.setOnMouseDragged(mouseDragEventHandler());
//    }
//    //Mouse drag event handdler
//    public EventHandler mouseDragEventHandler(){
//
//    }

}
