package pohikaust;

        import javafx.geometry.Insets;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextArea;
        import javafx.scene.image.Image;
        import javafx.scene.image.ImageView;

/**
 * Created by kaits on 27.11.2016.
 * Luuakse klahvid kasutamiseks Kassa klassis. Iga klahv vastab
 * ühele konkreetsele tootele.
 */
public class Klahvid {

    Button kohupiimaSai;
    Button rosinaSai;
    Button mooniRull;
    Button kaneeliRull;
    Button dallaseSai;
    Button moskvaSai;
    Button klahvLopetaOst;
    Button klahvUusOst;
    //Button klahvLopetaPaev;

    public Klahvid(TextArea cartField, Kassa currentGame) {
        ImageView klahv1 = new ImageView(new Image("pohikaust/pildid/kohupiimasai.png"));
        kohupiimaSai = new Button("", klahv1);
        kohupiimaSai.setOnAction(event -> cartField.setText(cartField.getText() + "Kohupiimapirukas 0,39€"));
        kohupiimaSai.setPadding(Insets.EMPTY);
        kohupiimaSai.setStyle("-fx-background-color: transparent");

        ImageView klahv2 = new ImageView(new Image("pohikaust/pildid/rosinasai.png"));
        rosinaSai = new Button("", klahv2);
        rosinaSai.setOnAction(event -> cartField.setText(cartField.getText() + "Rosinasai 0,30€"));
        rosinaSai.setPadding(Insets.EMPTY);
        rosinaSai.setStyle("-fx-background-color: transparent");

        ImageView klahv3 = new ImageView(new Image("pohikaust/pildid/moonirull.png"));
        mooniRull = new Button("", klahv3);
        mooniRull.setOnAction(event -> cartField.setText(cartField.getText() + "Moonirull 0,36€"));
        mooniRull.setPadding(Insets.EMPTY);
        mooniRull.setStyle("-fx-background-color: transparent");

        ImageView klahv4 = new ImageView(new Image("pohikaust/pildid/kaneelirull.png"));
        kaneeliRull = new Button("", klahv4);
        kaneeliRull.setOnAction(event -> cartField.setText(cartField.getText() + "Kaneelirull 0,32€"));
        kaneeliRull.setPadding(Insets.EMPTY);
        kaneeliRull.setStyle("-fx-background-color: transparent");

        ImageView klahv5 = new ImageView(new Image("pohikaust/pildid/dallasesai.png"));
        dallaseSai = new Button("", klahv5);
        dallaseSai.setOnAction(event -> cartField.setText(cartField.getText() + "Dallase sai 0,56€"));
        dallaseSai.setPadding(Insets.EMPTY);
        dallaseSai.setStyle("-fx-background-color: transparent");

        ImageView klahv6 = new ImageView(new Image("pohikaust/pildid/moskvasai.png"));
        moskvaSai = new Button("", klahv6);
        moskvaSai.setOnAction(event -> cartField.setText(cartField.getText() + "Moskva sai 0,37€"));
        moskvaSai.setPadding(Insets.EMPTY);
        moskvaSai.setStyle("-fx-background-color: transparent");

        ImageView uus = new ImageView(new Image("pohikaust/pildid/uus.png"));
        klahvUusOst = new Button("", uus);
        klahvUusOst.setOnAction(event -> cartField.setText("")); //kustutab toodete akna tühjaks
        klahvUusOst.setPadding(Insets.EMPTY);
        klahvUusOst.setStyle("-fx-background-color: transparent");
    }

    public Button getKohupiimaSaiLabel() {
        return kohupiimaSai;
    }

    public Button getRosinaSaiLabel() {
        return rosinaSai;
    }

    public Button getMooniRullLabel() {
        return mooniRull;
    }

    public Button getKaneeliRullLabel() {
        return kaneeliRull;
    }

    public Button getDallaseSaiLabel() {
        return dallaseSai;
    }

    public Button getMoskvaSaiLabel() {
        return moskvaSai;
    }

    public Button getKlahvUusOst () {
        return klahvUusOst;
    }

    /*public Button getKlahvLopetaPaev() {
        return klahvLopetaPaev;
    } */

}


