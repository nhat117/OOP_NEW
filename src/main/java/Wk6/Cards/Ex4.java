package Wk6.Cards;

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

public class Ex4 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(cardDisp());
        stage.setScene(scene);
        stage.setTitle("Vietnamese Cards");
        stage.show();
    }

    public GridPane cardDisp() {
        Button btDeal = new Button("Deal");
        Button btExit = new Button("Exit");
        GridPane pane = new GridPane();
        Text text = new Text();
        addPane(pane, text);
        //Set button action
        btDeal.setOnAction(event -> {
            addPane(pane, text);
        });

        btExit.setOnAction(e -> System.exit(1));

        pane.setPadding(new Insets(5, 5, 5, 5));
        // Add component to grid pane
        pane.add(btDeal, 1, 2);
        GridPane.setMargin(btDeal, new Insets(30, 0, 40, 150));

        pane.add(text, 2, 2);
        GridPane.setMargin(text, new Insets(15, 0, 80, 80));

        pane.add(btExit, 3, 2);
        GridPane.setMargin(btExit, new Insets(30, 150, 40, 0));
        return pane;
    }

    //Set the bound correlate to the number of card
    public int[] generateRandomNumber(Text text) {
        int[] randarr = new int[3];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            randarr[i] = random.nextInt(51) + 1;
        }
        text.setText(checkValue(randarr[0]) + checkValue(randarr[1]) + checkValue(randarr[2]) + " points");
        return randarr;
    }

    //Check the score
    public int checkValue(int a) {
        int modulus = a % 13;
        if (modulus > 10 || modulus == 0) {
            return 10;
        }
        return modulus;
    }

    //Add enerate randome, add image and change score
    public void addPane(GridPane pane, Text text) {
        int[] arrInt = generateRandomNumber(text);
        ImageView[] img = new ImageView[3];
        for (int i = 0; i < 3; i++) {
            //Directory of cards
            String cardDir = "file:///C:/Users/nhat1/IdeaProjects/OOP_NEW/src/main/java/Wk6/Cards/cards/" + arrInt[i] + ".png";
            img[i] = new ImageView(new Image(cardDir));
            img[i].setFitHeight(300);
            img[i].setFitWidth(200);
            img[i].setSmooth(true);
            pane.add(img[i], i + 1, 1);
        }
    }
}
