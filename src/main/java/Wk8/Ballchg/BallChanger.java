package Wk8.Ballchg;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BallChanger extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(ballController());
        stage.setScene(scene);
        stage.setTitle("Chart");
        stage.show();
    }

    public StackPane ballController() {
        BallPane ballPane = new BallPane(200,200, 50);
        HBox butt = ballPane.buttBOX();
        buttAction(ballPane);
        return new StackPane(ballPane, butt);
    }
//Wirring
    private void buttAction(BallPane ballPane) {
        ballPane.listButt.get(0).setOnAction(e -> ballPane.moveLeft());
        ballPane.listButt.get(1).setOnAction(e -> ballPane.moveRight());
        ballPane.listButt.get(2).setOnAction(e -> ballPane.moveDown());
        ballPane.listButt.get(3).setOnAction(e -> ballPane.moveUp());
    }
}
