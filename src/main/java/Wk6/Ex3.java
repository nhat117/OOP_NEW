package Wk6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.Collections;

public class Ex3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(drawGraph());
        stage.setScene(scene);
        stage.setTitle("Chart");
        stage.show();
    }

    public HBox drawGraph() {
        HBox hBox = new HBox(15);
        hBox.setAlignment(Pos.BOTTOM_CENTER);
        //Create content:
        String[] type = {"Project", "Quiz", "Midterm", "Final"};
        Integer[] grade = {20, 10, 30, 40};
        // Height and wide for each rectangle:
        double max = getMax(grade);
        double height = 200;
        double width = 150;
        // Create stack pane :
        //Set padding
        hBox.setPadding(new Insets(20, 15, 5, 15));
        // Create 4 rectangles
        Rectangle[] arrRect = new Rectangle[4];
        Text[] arrText = new Text[4];
        for (int i = 0; i < arrRect.length; i++) {
            arrRect[i] = new Rectangle(0, 0, width, height * grade[i] / max);
            arrText[i] = new Text(0, 0, type[i] + " -- " + grade[i] + "%");
            hBox.getChildren().add(addVbox(arrRect[i], arrText[i]));
        }
        //Set color
        arrRect[0].setFill(Color.RED);
        arrRect[1].setFill(Color.GREEN);
        arrRect[2].setFill(Color.BLUE);
        arrRect[3].setFill(Color.YELLOW);
        return hBox;
    }

    public double getMax(Integer[] score) {
        return Collections.max(Arrays.asList(score));
    }

    public VBox addVbox(Rectangle rect, Text t) {
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.BOTTOM_LEFT);
        vBox.getChildren().addAll(t, rect);
        return vBox;
    }
}
