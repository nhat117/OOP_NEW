package Wk8.pendule;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class pendulum extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        pendul pend = new pendul(400,400);
        Scene scene = new Scene(pend, 600, 600);

        stage.setScene(scene);
        stage.setTitle("Chart");
        pend.play();
        stage.show();
        // Map the key button
        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP:
                    pend.increase();
                    break;
                case DOWN:
                    pend.decrease();
                    break;
            }
        });
    }
}








