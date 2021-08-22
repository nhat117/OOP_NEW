package Wk8;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Hellocontroller extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    private boolean isCliked = true;
    @FXML
    private Button button;

    @FXML
    private Text text;

    @FXML
    private Scene scene;

    @FXML
    private BorderPane borderPane;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Wk8/hello-view.fxml"));
        stage.setTitle("Hello World");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();
    }
    @FXML
    public void onAction() {
        if(isCliked) {
            text.setText("Java is fun");
        } else  {
            text.setText("Java is shitt");
        }
    }
}
