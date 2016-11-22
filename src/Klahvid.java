import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by kaits on 18.10.2016.
 */
public class Klahvid extends Application {
    GridPane laud;
    int klahveHorisontaalselt =4;

    @Override
    public void start(Stage primaryStage) throws Exception {
        seadistaAken();
        lisaTooteklahvid();
        reageeriKlikile();

    }

    private void reageeriKlikile() {
        laud.setOnMouseClicked(event -> {
            Rectangle ruut = (Rectangle) event.getTarget();
            String tyyp = ruut.getId();
            if (tyyp.equals("sai")){

            }
        });
    }

    private void lisaTooteklahvid() {
        for (int i =0; i < klahveHorisontaalselt ; i++) {
            for (int j = 0; j <klahveHorisontaalselt ; j++) {
                Rectangle ruut = new Rectangle(150, 150);
                ruut.setStroke(Color.WHITE);
                ruut.setStrokeWidth(Double.valueOf(5));
                laud.add(ruut, i, j);
            }
        }
    }

    private void seadistaAken(){
            laud = new GridPane();
            Scene scene = new Scene(laud, 800, 600);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();









        /* VBox vbox = new VBox();
        Scene arvuta = new Scene(vbox, 400, 200);
        primaryStage.setScene(arvuta);
        primaryStage.show();
        Label pealkiri = new Label("Sisesta toote hind");
        TextField tootehind = new TextField();
        Button submit = new Button("Sisesta");
        vbox.getChildren().addAll(pealkiri, tootehind, submit); */


    }
}
