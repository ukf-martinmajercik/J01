package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.Glow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root= new Group();
        primaryStage.setTitle("Witcher");
        Scene scene = new Scene (root, 610,200);
        scene.setFill(Color.BLACK);

        Glow glow= new Glow();
        glow.setLevel(1);

        Polyline r1= new Polyline(98.3,106.7,85,120,125,120,85,80,125,80,111.7,93.3);
        r1.setStroke(Color.PURPLE);
        r1.setStrokeWidth(3);
        r1.setEffect(glow);

        Polyline r2= new Polyline(208.3,106.3,200,120,175,80,225,80,216.7,93.3,200,93.3);
        r2.setStroke(Color.YELLOW);
        r2.setStrokeWidth(3);
        r2.setEffect(glow);

        Polyline r3 = new Polyline(308.3,93.3,325,120,275,120,300,80);
        r3.setStroke(Color.RED);
        r3.setStrokeWidth(3);
        r3.setEffect(glow);


        Polyline r4= new Polyline(425,80,375,80,400,120,418.3,93.3);
        r4.setStroke(Color.GREEN);
        r4.setStrokeWidth(3);
        r4.setEffect(glow);

        Polyline r5= new Polyline(491.7,93.3,500,80,525,120,475,120,483.3,106.7,500,106.7);
        r5.setStroke(Color.AQUA);
        r5.setStrokeWidth(3);
        r5.setEffect(glow);

        root.getChildren().addAll(r1,r2,r3,r4,r5);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
