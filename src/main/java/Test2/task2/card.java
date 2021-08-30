/*
  RMIT University Vietnam
  Course: INTE2512 Object-Oriented Programming
  Semester: 2021B
  Assessment: Test 2
  Author: Bui Minh Nhat
  ID: s3878174
  Created  date: 30/08/2021
  Acknowledgement:
https://rmit.instructure.com/courses/88207/pages/w8-whats-happening-this-week?module_item_id=3237104
https://stackoverflow.com/questions/840190/changing-the-current-working-directory-in-java
https://stackoverflow.com/questions/5887709/getting-random-numbers-in-java
*/

package Test2.task2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class card extends Application {
    //Main function
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(cardDisp());
        stage.setScene(scene);
        stage.setTitle("Card Game");
        stage.show();
    }

    public GridPane cardDisp() {
        Button buttDeal = new Button("Deal");
        Button buttExit = new Button("Exit");
        GridPane pane = new GridPane();
        Text text = new Text();
        addPane(pane, text);
        //Set button action
        buttDeal.setOnAction(event -> {
            addPane(pane, text);
        });
        //Exit Button
        buttExit.setOnAction(e -> System.exit(0));
        //Pane configuration
        pane.setPadding(new Insets(5, 5, 5, 5));
        // Add component to grid pane
        pane.add(buttDeal, 1, 2);
        GridPane.setMargin(buttDeal, new Insets(30, 0, 40, 150));

        pane.add(text, 2, 2);
        GridPane.setMargin(text, new Insets(15, 0, 80, 80));

        pane.add(buttExit, 3, 2);
        GridPane.setMargin(buttExit, new Insets(30, 150, 40, 0));
        return pane;
    }

    //Set the bound correlate to the number of card
    public int[] generateRandomNumber(Text point) {
        int[] randarr = new int[3];
        Random random = new Random();
        //Generate 3 random number
        for (int i = 0; i < 3; i++) {
            randarr[i] = random.nextInt(51) + 1;
        }
        point.setText(checkValue(randarr[0]) + checkValue(randarr[1]) + checkValue(randarr[2]) + " points");
        return randarr;
    }

    //Check the score
    public int checkValue(int a) {
        int mod = a % 13;
        //If the score is over 10 or equal -
        if (mod > 10 || mod == 0) {
            return 10;
        }
        return mod;
    }

    //Add generate random, add image and change score
    public void addPane(GridPane pane, Text text) {
        int[] arrInt = generateRandomNumber(text);
        //Create an array of imageview
        ImageView[] img = new ImageView[3];
        for (int i = 0; i < 3; i++) {
            //Directory of task2
            String cardDir = "task2/cards/" + arrInt[i] + ".png";
          //Image setting
            img[i] = new ImageView(new Image(cardDir));
            img[i].setFitHeight(300);
            img[i].setFitWidth(200);
            img[i].setSmooth(true);
            pane.add(img[i], i + 1, 1);
        }
    }
}
