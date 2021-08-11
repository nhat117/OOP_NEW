package Wk6;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class TrafficLight extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Random random = new Random();
        Scene scene = new Scene(drawArrowLine(10, 200, 350, 200));
        stage.setScene(scene);
        stage.setTitle("Chart");
        stage.show();
    }

    private Pane drawArrowLine(double startX, double endX, double startY, double endY) {
	        Pane pane2 = new Pane();
        Line lineX = new Line(startX, startY, endX, endY);

        pane2.getChildren().addAll( lineX);

        //Draw an arrow
        Polyline polyline3 = new Polyline();
        pane2.getChildren().add(polyline3);
        ObservableList<Double> list3 = polyline3.getPoints();
        list3.addAll(lineX.getEndX() - 20, lineX.getEndY() - 10,
                lineX.getEndX(), lineX.getEndY(), lineX.getEndX() - 20,
                lineX. getEndY() + 10);
        return pane2;
    }

}
