package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        VBox root= new VBox(10);
        Scene scene= new Scene(root,500, 200);

        Button b1= new Button("Prefarbi");
        TextField t1= new TextField();
        Label l1= new Label();

        root.setSpacing(20);
        root.setAlignment(Pos.CENTER);
        root.setMargin(t1, new Insets(10));

        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ActionEvent) {
                int r, g, b, samohl=0 , spoluhl=0, vsetky=0;
                String text= t1.getText();
                text.toLowerCase();
                for(int i=0;i<text.length();i++){
                    if(text.substring(i,i+1).matches("[aáeéiíyýoóuú]")){
                        samohl++;
                        vsetky++;
                    }
                    else if (text.substring(i,i+1).matches("[qwrŕřtťzžpsšdďfghjklĺľxcčvbnňm]")){
                        spoluhl++;
                        vsetky++;
                    }
                }

                r=samohl*16;
                g=spoluhl*24;
                b=(vsetky%20)*10;

                l1.setText(text+" "+samohl+" "+spoluhl+" "+vsetky);
                l1.setTextFill(Color.WHITE);
                l1.setScaleX(2);
                l1.setScaleY(2);

                root.setBackground(new Background(new BackgroundFill(Color.rgb(r,g,b),null,null)));

            }
        });


        root.getChildren().addAll(t1,b1,l1);
        primaryStage.setTitle("J01");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
