package Wk8;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseDetectorCircle extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(ballController(), 400, 400);
        stage.setScene(scene);
        stage.setTitle("Chart");
        stage.show();
    }
    //Detect a mouse to sea weather is inside or outside
    public Pane ballController() {
        Pane pane = new Pane();
        Circle cir = new Circle(200,200,50);
        cir.setFill(Color.WHITE);
        cir.setStroke(Color.BLACK);
        pane.getChildren().add(cir);
        setAct(pane,cir);
        return pane;
    }

    private void setAct(Pane pane, Circle cir) {
        pane.setOnMouseMoved(e -> {
            //Clear the pane
            pane.getChildren().clear();
            Text txt = new Text();
            txt.setX(e.getX());
            txt.setY(e.getY());
            if(cir.contains(e.getX(), e.getY())) {
                txt.setText("Mouse is inside the circle");
            } else {
                txt.setText("Mouse is outside the circle");
            }
            pane.getChildren().addAll(cir,txt);
        });

    }
}
