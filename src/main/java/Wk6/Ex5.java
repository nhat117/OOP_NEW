package Wk6;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ArrayList;


public class Ex5 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    //Start component of application
    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(drawLine());
        stage.setScene(scene);
        stage.setTitle("Chart");
        stage.show();
    }

    private Pane drawLine() {
        Pane pane = new Pane();
        ArrayList <Circle> cir =  createCir();
        ArrayList<Text> text = createText(cir);

         //Drawline
        int i = 0;
        Line line = new Line(cir.get(i).getCenterX(), cir.get(i).getCenterY(),
                    cir.get(i +1).getCenterX(),cir.get(i + 1).getCenterY());


        pane.getChildren().addAll(line, cir.get(i),cir.get(i + 1), text.get(0), text.get(i + 1));
        return pane;
    }

    private ArrayList<Circle> createCir() {
        ArrayList<Circle> circleList = new ArrayList<>();
        //Add 2 circle 2 list
        int pixel = 15;
        circleList.add(new Circle(Math.random()*201, Math.random()* 201, pixel));
        circleList.add(new Circle(Math.random()*201, Math.random()* 201, pixel));

        for (Circle value : circleList) {
            value.setFill(Color.WHITE);
            value.setStroke(Color.BLACK);
        }

        return circleList;
    }

    private ArrayList<Text> createText(ArrayList<Circle> circleList) {
        ArrayList <Text> text = new ArrayList<>();

        for(int i = 0; i < circleList.size(); i ++) {
            text.add(new Text(circleList.get(i).getCenterX(), circleList.get(i).getCenterY(), String.valueOf(i +1)));
        }

        return text;
    }
}
