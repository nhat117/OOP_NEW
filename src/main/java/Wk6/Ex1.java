package Wk6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public GridPane imageDispl() {


        String[] url = {
                "https://cdn.britannica.com/79/4479-050-6EF87027/flag-Stars-and-Stripes-May-1-1795.jpg",
                "https://live.staticflickr.com/3213/2654355921_d5d8773f33_b.jpg",
                "https://i.pinimg.com/originals/3c/e9/45/3ce9451d8b900bcc09b10143a2fc2c6c.png",
                "https://lh3.googleusercontent.com/proxy/_-tIk1JnrpRCAfCqyGE0CYFQFrZj4Efawtwe4Mjd0X_XDx_OKbvLxErqlXd9PUZQVVULy4Pv852GCvk3BMsOoeVPIpaXXlw_hxeOWa5auYZVFAK-Zfxgig"
        };

        ImageView image = new ImageView();

        GridPane gridPane = new GridPane();


        //LOOPS
        for (int i = 0; i < 4; i++) {
            image = new ImageView(url[i]);
            image.setFitWidth(400);
            image.setPreserveRatio(true);
            image.setSmooth(true);
            //Formula to add to gridpane
            gridPane.add(image, ((i % 2 == 0) ? i / 2 : (i - 1) / 2), i % 2 + 1);
        }
        return gridPane;
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(imageDispl());
        stage.setScene(scene);
        stage.setTitle("Flags");
        stage.show();
    }
}
