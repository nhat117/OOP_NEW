package Wk8.Clock;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Clck extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(disp(),350,350);
        stage.setScene(scene);
        stage.setTitle("Clock");
        stage.show();
    }

    public BorderPane disp() {
        ClockPane clock = new ClockPane();
        HBox hBox = new HBox(5);

        //Setup the text
        hBox.setAlignment(Pos.CENTER);

        //Create two button
        Button buttStart = new Button("Start");
        Button buttStop = new Button("Stop");

        //Add to Hbox
        buttStart.setOnAction(e-> clock.play());
        buttStop.setOnAction(e-> clock.pause());

        hBox.setPadding(new Insets(5,5,5,5));
        hBox.setSpacing(5);
        hBox.getChildren().addAll(buttStart,buttStop);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(clock);
        borderPane.setBottom(hBox);
        return borderPane;
    }
}
