package Wk6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ex2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public GridPane boardDispl() {
        GridPane gridPane = new GridPane();
        int count = 0;

        for (int i = 0; i < 8; i++) {
            //Create a rectangle
            count++;
            for (int j = 0; j < 8; j++) {
                javafx.scene.shape.Rectangle rect = new Rectangle(100, 100, 100, 100);
                if (count % 2 == 0) {
                    rect.setFill(Color.WHITE);
                } else {
                    rect.setFill(Color.BLACK);
                }
                gridPane.add(rect, i, j);
                count++;
            }
        }
        //LOOPS
        return gridPane;
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(boardDispl());
        stage.setScene(scene);
        stage.setTitle("Checkboard");
        stage.show();
    }
}
