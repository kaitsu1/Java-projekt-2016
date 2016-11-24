package pohikaust;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * Created by kaits on 20/10/16.
 * Peamine klass
 */
public class Kassa extends Application {

    Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        kuvaAvaKuva();
        primaryStage.show();
    }

    //Avakuva. Kassaaparaat ilmub peale "Sisene poodi" nupu vajutamist
    private void kuvaAvaKuva(){
        Pane startTaust = new Pane();
        BackgroundImage startTaustPilt = getBackGroundImage("pohikaust/pildid/avaleht.png");
        startTaust.setBackground(new Background(startTaustPilt));

        ImageView alusta = new ImageView(new Image("pohikaust/pildid/klahvAlusta.png"));
        Button klahvAlusta = new Button("", alusta);
        klahvAlusta.setLayoutX(70);
        klahvAlusta.setLayoutY(250);
        klahvAlusta.setPadding(Insets.EMPTY);
        klahvAlusta.setStyle("-fx-background-color: transparent");

        startTaust.getChildren().add(klahvAlusta);

        Scene scene = new Scene(startTaust, 600, 400);
        stage.setScene(scene);
        stage.setOnCloseRequest(event -> System.exit(0));
    }

    //Taustapilt
    private BackgroundImage getBackGroundImage(String backgroundImageFile) {
        return new BackgroundImage(new Image(backgroundImageFile, 750, 500, false, true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
    }
}
