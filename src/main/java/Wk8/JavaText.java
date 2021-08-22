package Wk8;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class JavaText extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(drawText());
        stage.setScene(scene);
        stage.setTitle("Chart");
        stage.show();
    }

    public StackPane drawText() {
        ArrayList <String> txt = createText();
        StackPane pane = new StackPane();
       //Set Allignment of pane
        pane.setAlignment(Pos.CENTER);

        //Handle mouse click action
        javafx.scene.text.Text text = new Text(txt.get(0));

        text.setOnMouseClicked(e -> {
            if (text.getText().contains(txt.get(0))) {
                text.setText(txt.get(1));
            } else {
                text.setText(txt.get(0));

            }
        });
        pane.getChildren().add(text);
        return pane;
    }

    public ArrayList<String> createText() {
        ArrayList<String> txt = new ArrayList<>();
        txt.add("Java is fun");
        txt.add("Jave is suck");
        return txt;
    }
}
