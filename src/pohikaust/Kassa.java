package pohikaust;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Created by kaits on 20/10/16.
 * Peamine klass.
 */
public class Kassa extends Application {

    GridPane ruudustik;
    StackPane taust;
    Stage lava;
    TextArea ostuKorv;
    BackgroundImage taustapilt;
    BackgroundImage avaTaustPilt;

    @Override
    public void start(Stage primaryStage) throws Exception {
        lava = primaryStage;
        kuvaAvaKuva();
        primaryStage.show();
    }

    //Avakuva. Kassaaparaat ilmub peale "Sisene poodi" nupu vajutamist
    private void kuvaAvaKuva(){
        Pane avaPaneel = new Pane();
        avaTaustPilt = getBackgroundImage("pohikaust/pildid/avaleht.png");
        avaPaneel.setBackground(new Background(avaTaustPilt));

        ImageView alusta = new ImageView(new Image("pohikaust/pildid/sisene.png"));
        Button klahvAlusta = new Button("", alusta);
        klahvAlusta.setLayoutX(70);
        klahvAlusta.setLayoutY(250);
        klahvAlusta.setOnAction(event -> kassaStseen());
        klahvAlusta.setOnAction(event -> loginKuva());
        klahvAlusta.setPadding(Insets.EMPTY);
        klahvAlusta.setStyle("-fx-background-color: transparent");

        avaPaneel.getChildren().add(klahvAlusta);

        Scene scene = new Scene(avaPaneel, 600, 400);
        lava.setScene(scene);
        lava.setOnCloseRequest(event -> System.exit(0));
    }
    //sisselogimise aken
    public void loginKuva() {
        VBox vbox = new VBox();
        Scene login = new Scene(vbox, 600, 400);
        lava.setScene(login);

        Label pealkiri = new Label("Sisesta parool:");
        TextField paroolField = new TextField();
        Button submitButton = new Button("Login");

        vbox.getChildren().addAll(pealkiri, paroolField, submitButton);

        submitButton.setOnAction(event -> {
            String parool = paroolField.getText();
            if (parool.equals("Saiake")){
                System.out.println("Parool on õige");
                kassaStseen();
            } else {
                pealkiri.setText("Parool vale, sisesta uuesti");
                paroolField.setText("");
            }
        });

    }

    //Taustapilt
    private BackgroundImage getBackgroundImage(String backgroundImageFile) {
        return new BackgroundImage(new Image(backgroundImageFile, 750, 500, false, true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
    }

    //Luuakse kassaekraan
    public void kassaStseen() {
        taust = new StackPane();
        taustapilt = getBackgroundImage("pohikaust/pildid/taust.png");
        taust.setBackground(new Background(taustapilt));

        ruudustik = looKassaRuudustik();
        taust.getChildren().add(ruudustik);

        // Siin textarea sees hakatakse kuvama tooteid
        ostuKorv = new TextArea();
        ostuKorv.setPrefColumnCount(1);
        ostuKorv.setBackground(Background.EMPTY);
        ostuKorv.setEditable(false);//ei ole ette nähtud lisatud tooteid käsitsi muuta
        ostuKorv.setFont(Font.font("Serif", 40));
        ruudustik.add(ostuKorv, 6, 2, 5, 2);

        Klahvid klahvistik = new Klahvid(ostuKorv);
        looKlahvistik(klahvistik);;

        Scene scene = new Scene(taust);
        lava.setScene(scene);
        lava.centerOnScreen();//kassa avaneb keset ekraani
        lava.setOnCloseRequest(event -> System.exit(0));
    }

    //Klahvide asukohad ekraanil (GridPane-s).
    private void looKlahvistik(Klahvid klahvistik) {
        ruudustik.add(klahvistik.getKohupiimaSai(), 2, 2);//veerg, rida
        ruudustik.add(klahvistik.getRosinaSai(), 3, 2);
        ruudustik.add(klahvistik.getMooniRull(), 4, 2);
        ruudustik.add(klahvistik.getKaneeliRull(), 2, 3);
        ruudustik.add(klahvistik.getDallaseSai(), 3, 3);
        ruudustik.add(klahvistik.getMoskvaSai(), 4, 3);
        ruudustik.add(klahvistik.getKlahvLopetaOst(), 4, 4);
        ruudustik.add(klahvistik.getKlahvUusOst(), 2, 4);
    }

    //Paigutus
    private GridPane looKassaRuudustik() {
        GridPane gridPaneResult = new GridPane();
        gridPaneResult.setHgap(10);
        gridPaneResult.setVgap(10);
        gridPaneResult.getRowConstraints().add(new RowConstraints(10));
        gridPaneResult.getRowConstraints().add(new RowConstraints(100));
        gridPaneResult.getRowConstraints().add(new RowConstraints(200));
        gridPaneResult.getRowConstraints().add(new RowConstraints(250));
        gridPaneResult.getRowConstraints().add(new RowConstraints(100));
        gridPaneResult.getRowConstraints().add(new RowConstraints(100));
        gridPaneResult.getColumnConstraints().add(new ColumnConstraints(0));
        gridPaneResult.getColumnConstraints().add(new ColumnConstraints(50));
        gridPaneResult.getColumnConstraints().add(new ColumnConstraints(200));
        gridPaneResult.getColumnConstraints().add(new ColumnConstraints(200));
        gridPaneResult.getColumnConstraints().add(new ColumnConstraints(200));
        gridPaneResult.getColumnConstraints().add(new ColumnConstraints(50));
        gridPaneResult.getColumnConstraints().add(new ColumnConstraints(500));
        return gridPaneResult;
    }

}
