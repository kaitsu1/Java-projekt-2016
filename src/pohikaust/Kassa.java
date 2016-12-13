package pohikaust;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Created by kaits on 20/10/16.
 * Peamine klass
 */
public class Kassa extends Application {

    GridPane grid;
    StackPane taust;
    Stage stage;
    TextArea ostuKorv;
    BackgroundImage taustapilt;

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

        ImageView alusta = new ImageView(new Image("pohikaust/pildid/sisene.png"));
        Button klahvAlusta = new Button("", alusta);
        klahvAlusta.setLayoutX(70);
        klahvAlusta.setLayoutY(250);
        klahvAlusta.setOnAction(event -> newGameScene());
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
    //Luuakse kassaekraan
    public void newGameScene() {
        taust = new StackPane();
        taustapilt = getBackGroundImage("pohikaust/pildid/taust.png");
        taust.setBackground(new Background(taustapilt));

        grid = looKassaGridPane();
        taust.getChildren().add(grid);

        // Siin textarea sees hakatakse kuvama tooteid
        ostuKorv = new TextArea();
        ostuKorv.setPrefColumnCount(1);
        ostuKorv.setBackground(Background.EMPTY);
        ostuKorv.setEditable(false);
        ostuKorv.setWrapText(true);
        ostuKorv.setFont(Font.font("Serif", 40));
        grid.add(ostuKorv, 6, 2, 5, 2);

        Klahvid klahvistik = new Klahvid(ostuKorv, this);
        looKlahvistik(klahvistik);;

        Scene scene = new Scene(taust);
        stage.setScene(scene);
        stage.setOnCloseRequest(event -> System.exit(0));
    }

    //Klahvide asukohad ekraanil (GridPane-s).
    private void looKlahvistik(Klahvid klahvistik) {
        grid.add(klahvistik.getKohupiimaSaiLabel(), 2, 2);
        grid.add(klahvistik.getRosinaSaiLabel(), 3, 2);
        grid.add(klahvistik.getMooniRullLabel(), 4, 2);
        grid.add(klahvistik.getKaneeliRullLabel(), 2, 3);
        grid.add(klahvistik.getDallaseSaiLabel(), 3, 3);
        grid.add(klahvistik.getMoskvaSaiLabel(), 4, 3);
        grid.add(klahvistik.getKlahvLopetaOst(), 2, 5);
        grid.add(klahvistik.getKlahvUusOst(), 2, 4);
    }

    //Paigutus
    private GridPane looKassaGridPane() {
        GridPane gridPaneResult = new GridPane();
        gridPaneResult.setHgap(10);
        gridPaneResult.setVgap(10);
        gridPaneResult.getRowConstraints().add(new RowConstraints(10));
        gridPaneResult.getRowConstraints().add(new RowConstraints(100));
        gridPaneResult.getRowConstraints().add(new RowConstraints(200));
        gridPaneResult.getRowConstraints().add(new RowConstraints(200));
        gridPaneResult.getRowConstraints().add(new RowConstraints(200));
        gridPaneResult.getRowConstraints().add(new RowConstraints(200));
        gridPaneResult.getRowConstraints().add(new RowConstraints(1));
        gridPaneResult.getColumnConstraints().add(new ColumnConstraints(0));
        gridPaneResult.getColumnConstraints().add(new ColumnConstraints(50));
        gridPaneResult.getColumnConstraints().add(new ColumnConstraints(200));
        gridPaneResult.getColumnConstraints().add(new ColumnConstraints(200));
        gridPaneResult.getColumnConstraints().add(new ColumnConstraints(200));
        gridPaneResult.getColumnConstraints().add(new ColumnConstraints(50));
        gridPaneResult.getColumnConstraints().add(new ColumnConstraints(566));
        return gridPaneResult;
    }

}
