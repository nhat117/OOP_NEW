/*
  RMIT University Vietnam
  Course: INTE2512 Object-Oriented Programming
  Semester: 2021B
  Assessment: Test 2
  Author: Bui Minh Nhat
  ID: s3878174
  Created  date: 30/08/2021
  Acknowledgement:
  https://www.geeksforgeeks.org/javafx-borderpane-class/
  https://www.tutorialspoint.com/javafx/javafx_text.htm
*/


package Test2.task1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    //Create a text node
    private Text text;
    //Constant
    private final int LOWERLIMIT = 10;
    private final int UPPERLIMIT = 80;
    private final int W = 400, H = 400, DEFAULT = 40, DELTA = 5;
    private final String FAMILY = "Arial";

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Task2");
        Scene scene = new Scene(setpane(), W, H);
        primaryStage.setScene(scene);
        //Handle key action
        scene.setOnKeyPressed(this::changeSize);
        //Handle mouse action
        scene.setOnMouseClicked(this::colorChange);
        primaryStage.show();
    }

    public FlowPane setpane() {
        FlowPane pane = new FlowPane();
        createText();
        pane.getChildren().add(text);
        //Set Allignment
        return pane;
    }

    public Text createText() {
        text = new Text("Java is cool!");
        Font font = Font.font("Arial", FontWeight.BOLD, DEFAULT);
        text.setFont(font);
        text.setFill(Color.BLUE);
        text.setLayoutX(50);
        text.setLayoutY(50);
        return text;
    }

    public void changeSize(KeyEvent event) {
    //Get the key event
        KeyCode code = event.getCode();
        if (code == KeyCode.UP) {
            if (text.getFont().getSize() <= UPPERLIMIT) {
                Font fontTemp = Font.font(FAMILY, FontWeight.BOLD, text.getFont().getSize() + DELTA);
                text.setFont(fontTemp);
            }
        } else if (code == KeyCode.DOWN) {
            if (text.getFont().getSize() >= LOWERLIMIT) {
                Font fontTemp = Font.font(FAMILY, FontWeight.BOLD, text.getFont().getSize() - DELTA);
                text.setFont(fontTemp);
            }
        }
    }

    //Change color
    public void colorChange(MouseEvent event) {
        if (text.getFill() == Color.BLUE) {
            text.setFill(Color.RED);
        } else {
            text.setFill(Color.BLUE);
        }
    }
}
