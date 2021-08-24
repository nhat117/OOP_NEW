package Wk8.pendule;

import javafx.animation.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class pendul extends Pane {

        //pANE PROPERTY
        private double w,h;

        //Pendulum pane property
        private static PathTransition pathTransition;
        private Circle topCirc,downCirc;

        private Line line;
        private Arc arc;

        //Create Constructor
        public pendul(double w, double h) {
            this.w = w;
            this.h = h;

            //Set arc property for animation
            this.arc = new Arc(this.w/2, this.h = 0.6, w = 0.5, w = 0.5, 100, 100);
            this.arc.setFill(Color.TRANSPARENT);

            //Top Circle property
            this.downCirc = new Circle(arc.getCenterX() - arc.getRadiusX(), arc.getCenterY() - arc.getRadiusY(), 10);
            this.topCirc = new Circle(arc.getCenterX(), arc.getCenterY() - this.h / 2, downCirc.getRadius() / 2);

            //Lower circle property:%c
            //set arc property for pendulum:
            arc = new Arc(topCirc.getCenterX(), topCirc.getCenterY(), w / 2, h / 2, 240, 60);

            //set line for hand of the pendulum:
            Line line = new Line(topCirc.getCenterX(), topCirc.getCenterY(), downCirc.getCenterX(), downCirc.getCenterY());

            //Binding the lower circle with the hand:
            line.endXProperty().bind(downCirc.translateXProperty().add(downCirc.getCenterX()));
            line.endYProperty().bind(downCirc.translateYProperty().add(downCirc.getCenterY()));

            final Rotate secondRotate = new Rotate(90);
            final Timeline secondTime = new Timeline(
                    new KeyFrame(
                            Duration.seconds(1.0),
                            new KeyValue(
                                    secondRotate.angleProperty(),
                                    -90, Interpolator.EASE_BOTH
                            )
                    )
            );

            secondTime.setAutoReverse(true);
            secondTime.setCycleCount(Timeline.INDEFINITE);
            //pendulum arc
            ArcTo arcTo = new ArcTo(100, 100, 0, 400, 50, true, false);

            //transforming pendulum arc to shape
            Path path  = new Path();
            path.getElements().addAll(new MoveTo(50, 50), arcTo);
            path.setOpacity(0.1);

            //adding all into pathtransition
            pathTransition = new PathTransition();
            pathTransition.setDuration(Duration.seconds(1.0));
            pathTransition.setPath(path);
            pathTransition.setNode(downCirc);
            pathTransition
                    .setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
            pathTransition.setCycleCount(Timeline.INDEFINITE);
            pathTransition.setAutoReverse(true);
            //Add all of the things to pane
            getChildren().addAll(downCirc, topCirc,line);
        }

        //Set the action of th pendulum
        public void play() {
            pathTransition.play();
        }

        public static void  increase() {
            pathTransition.setRate(pathTransition.getCurrentRate() +1);
        }

        public static void decrease() {
            if(pathTransition.getRate() > 0) {
                pathTransition.setRate(pathTransition.getCurrentRate() -1);
            }
        }
}
