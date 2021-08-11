package Wk6;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;


public class Traffic extends Application {
    private double paneWidth = 300;
    private double paneHeight = 500;

    public static void main(String[] args) {
         launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(draw(), paneWidth, paneHeight);
        stage.setScene(scene);
        stage.setTitle("Traffic Light");
        stage.show();
    }
//Controler wiring circle to button
    public void controller(ArrayList<Button> button, ArrayList <Circle> circle) {
        //NEXT BUTOON
	        button.get(0).setOnAction(e -> {
            circle.get(0).setFill(Color.RED);
            circle.get(1).setFill(Color.GREY);
            circle.get(2).setFill(Color.GREY);

            button.get(0).setOnAction(e1 -> {
                circle.get(0).setFill(Color.GREY);
                circle.get(1).setFill(Color.GREY);
                circle.get(2).setFill(Color.GREEN);

                button.get(0).setOnAction(e2 -> {
                    circle.get(0).setFill(Color.GREY);
                    circle.get(1).setFill(Color.ORANGE);
                    circle.get(2).setFill(Color.GREY);

                    controller(button,circle);
                });
            });
        });
//Exit button
        button.get(1).setOnAction(e -> System.exit(1));
    }

    public BorderPane draw() {
        //Create arraylist of button
        ArrayList<Circle> circle = new ArrayList<Circle>();
        ArrayList<Button> button = new ArrayList<Button>();
        //Draw the layout of the traffic light
        StackPane stackPane = new StackPane();
        //Set Stackpane component
        setRect(stackPane);
        setCircle(stackPane,circle);
        //Set borderpane
        BorderPane allPane = new BorderPane();
        allPane.setCenter(stackPane);
        allPane.setBottom(setButton(button));
        allPane.setTop(setText());
        //Wirering the controller
        controller(button,circle);
        return allPane;
    }
//Create title text
    public HBox setText() {
        HBox textHBox = new HBox();
        Text text = new Text();
        text.setText("Traffic Light");
        text.setFont(new Font("Arial", 40));
        textHBox.getChildren().add(text);
        textHBox.setAlignment(Pos.CENTER);
        return textHBox;
    }
//Set the main body of the traffuc light
    public void setRect(StackPane stackPane) {
        Rectangle rect = new Rectangle(125,250,125,300);
        rect.setFill(Color.BLACK);
        rect.setStroke(Color.BLACK);
        rect.setSmooth(true);
        stackPane.getChildren().add(rect);
    }
//Traffic light circle
    public void setCircle(StackPane stackPane, ArrayList<Circle> cir) {
        VBox vBox = new VBox();
        //Generate new Circle
        for (int i = 0; i < 3; i ++) {
            cir.add(new Circle(paneWidth / 2, 60, 40));
            cir.get(i).setStroke(Color.BLACK);
            cir.get(i).setFill(Color.GREY);
            vBox.getChildren().add(cir.get(i));
        }
        //Add Circle to vbox
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(5,5,5,5));
        vBox.setSpacing(5);
        stackPane.getChildren().add(vBox);
    }

    public HBox setButton(ArrayList<Button> buttons) {
            HBox button = new HBox();
            buttons.add(new Button("next"));
            buttons.add(new Button("exit"));
            //Add button to hobox
            for (int i = 0; i < 2; i ++) {
                button.getChildren().add(buttons.get(i));
            }
            //Set property for buttpon
            button.setAlignment(Pos.CENTER);
            button.setSpacing(10);
            button.setPadding(new Insets(5,5,5,5));
            return button;
    }
}
