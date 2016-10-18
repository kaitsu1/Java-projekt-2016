import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by kaits on 18.10.2016.
 */
public class Klahvid extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox = new VBox();
        Scene arvuta = new Scene(vbox, 400, 200);
        primaryStage.setScene(arvuta);
        primaryStage.show();
        Label pealkiri = new Label("Sisesta toote hind");
        TextField tootehind = new TextField();
        Button submit = new Button("Sisesta");
        vbox.getChildren().addAll(pealkiri, tootehind, submit);
    }
}
