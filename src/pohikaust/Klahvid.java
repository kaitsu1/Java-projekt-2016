package pohikaust;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.text.DecimalFormat;

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
    int offSet1= -1, offSet2= -1, offSet3= -1, offSet4= -1, offSet5= -1, offSet6 = -1, offSet7 = -1;
    int counter1= 0, counter2= 0, counter3= 0, counter4= 0, counter5= 0, counter6 = 0;
    //Button klahvLopetaPaev;

    public Klahvid(TextArea cartField, Kassa currentGame) {
        ImageView klahv1 = new ImageView(new Image("pohikaust/pildid/kohupiimasai.png"));
        kohupiimaSai = new Button("", klahv1);
        double price1 = 0.39;

        kohupiimaSai.setOnAction(event -> {
            counter1++;
            String nimekiri1 = counter1+"x Kohupiimapirukas "+price1+"€";
            if (counter1 < 10) nimekiri1 = nimekiri1+"  ";
            if (10<=counter1 && counter1<100) nimekiri1 = nimekiri1+" ";
            nimekiri1=nimekiri1+"\n";
            if (offSet1 == -1) {offSet1 = cartField.getLength();
                cartField.appendText(nimekiri1);}
            else cartField.replaceText(offSet1, (offSet1+nimekiri1.length()), nimekiri1);
        });
        kohupiimaSai.setPadding(Insets.EMPTY);
        kohupiimaSai.setStyle("-fx-background-color: transparent");

        ImageView klahv2 = new ImageView(new Image("pohikaust/pildid/rosinasai.png"));
        rosinaSai = new Button("", klahv2);
        double price2 = 0.30;
        rosinaSai.setOnAction(event -> {
            counter2++;
            String nimekiri2 = counter2+"x Rosinasai "+price2+"€";
            if (counter2 < 10) nimekiri2 = nimekiri2+"  ";
            if (10<=counter2 && counter2<100) nimekiri2 = nimekiri2+" ";
            nimekiri2=nimekiri2+"\n";
            if (offSet2 == -1) {offSet2 = cartField.getLength();
                cartField.appendText(nimekiri2);}
            else cartField.replaceText(offSet2, (offSet2+nimekiri2.length()), nimekiri2);
        });

        rosinaSai.setPadding(Insets.EMPTY);
        rosinaSai.setStyle("-fx-background-color: transparent");

        ImageView klahv3 = new ImageView(new Image("pohikaust/pildid/moonirull.png"));
        mooniRull = new Button("", klahv3);
        double price3 = 0.36;

        mooniRull.setOnAction(event -> {
            counter3++;
            String nimekiri3 = counter3+"x Moonirull "+price3+"€";
            if (counter3 < 10) nimekiri3 = nimekiri3+"  ";
            if (10<=counter3 && counter3<100) nimekiri3 = nimekiri3+" ";
            nimekiri3=nimekiri3+"\n";
            if (offSet3 == -1) {offSet3 = cartField.getLength();
                cartField.appendText(nimekiri3);}
            else cartField.replaceText(offSet3, (offSet3+nimekiri3.length()), nimekiri3);
        });

        mooniRull.setPadding(Insets.EMPTY);
        mooniRull.setStyle("-fx-background-color: transparent");

        ImageView klahv4 = new ImageView(new Image("pohikaust/pildid/kaneelirull.png"));
        kaneeliRull = new Button("", klahv4);
        double price4 = 0.32;

        kaneeliRull.setOnAction(event -> {
            counter4++;
            String nimekiri4 = counter4+"x Kaneelirull "+price4+"€";
            if (counter4 < 10) nimekiri4 = nimekiri4+"  ";
            if (10<=counter4 && counter4<100) nimekiri4 = nimekiri4+" ";
            nimekiri4=nimekiri4+"\n";
            if (offSet4 == -1) {offSet4 = cartField.getLength();
                cartField.appendText(nimekiri4);}
            else cartField.replaceText(offSet4, (offSet4+nimekiri4.length()), nimekiri4);
        });
        kaneeliRull.setPadding(Insets.EMPTY);
        kaneeliRull.setStyle("-fx-background-color: transparent");

        ImageView klahv5 = new ImageView(new Image("pohikaust/pildid/dallasesai.png"));
        dallaseSai = new Button("", klahv5);
        double price5 = 0.56;
        dallaseSai.setOnAction(event -> {
            counter5++;
            String nimekiri5 = counter5+"x Dallase sai "+price5+"€";
            if (counter5 < 10) nimekiri5 = nimekiri5+"  ";
            if (10<=counter5 && counter5<100) nimekiri5 = nimekiri5+" ";
            nimekiri5=nimekiri5+"\n";
            if (offSet5 == -1) {offSet5 = cartField.getLength();
                cartField.appendText(nimekiri5);}
            else cartField.replaceText(offSet5, (offSet5+nimekiri5.length()), nimekiri5);
        });
        dallaseSai.setPadding(Insets.EMPTY);
        dallaseSai.setStyle("-fx-background-color: transparent");

        ImageView klahv6 = new ImageView(new Image("pohikaust/pildid/moskvasai.png"));
        moskvaSai = new Button("", klahv6);
        double price6 = 0.37;

        moskvaSai.setOnAction(event -> {
            counter6++;
            String nimekiri6 = counter6+"x Moskva sai "+price6+"€";
            if (counter6 < 10) nimekiri6 = nimekiri6+"  ";
            if (10<=counter6 && counter6<100) nimekiri6 = nimekiri6+" ";
            nimekiri6=nimekiri6+"\n";
            if (offSet6 == -1) {offSet6 = cartField.getLength();
                cartField.appendText(nimekiri6);}
            else cartField.replaceText(offSet6, (offSet6+nimekiri6.length()), nimekiri6);
        });
        moskvaSai.setPadding(Insets.EMPTY);
        moskvaSai.setStyle("-fx-background-color: transparent");

        ImageView lopeta = new ImageView(new Image("main/pildid/lopeta.png"));
        klahvLopetaOst = new Button("", lopeta);
        klahvLopetaOst.setOnAction(event -> {
            DecimalFormat df = new DecimalFormat("###.##");
            double kokku = (counter1*price1+counter2*price2+counter3*price3+counter4*price4+counter5*price5+counter6*price6);
            String nimekiri7 = "\n Kokku: "+ df.format(kokku)+"€\n";
            kohupiimaSai.setDisable(true);
            rosinaSai.setDisable(true);
            mooniRull.setDisable(true);
            kaneeliRull.setDisable(true);
            dallaseSai.setDisable(true);
            moskvaSai.setDisable(true);
            if (offSet7 == -1) {offSet7 = cartField.getLength();
                cartField.appendText(nimekiri7);}
            else cartField.replaceText(offSet7, (offSet7+nimekiri7.length()), nimekiri7);
        });
        klahvLopetaOst.setPadding(Insets.EMPTY);
        klahvLopetaOst.setStyle("-fx-background-color: transparent");


        ImageView uus = new ImageView(new Image("pohikaust/pildid/uus.png"));
        klahvUusOst = new Button("", uus);
        klahvUusOst.setOnAction(event -> {    //kustutab toodete akna tühjaks
            cartField.setText("");
            kohupiimaSai.setDisable(false);
            rosinaSai.setDisable(false);
            mooniRull.setDisable(false);
            kaneeliRull.setDisable(false);
            dallaseSai.setDisable(false);
            moskvaSai.setDisable(false);
            offSet1= -1; offSet2= -1; offSet3= -1; offSet4= -1; offSet5= -1; offSet6 = -1; offSet7 = -1;
            counter1= 0; counter2= 0; counter3= 0; counter4= 0; counter5= 0; counter6 = 0;
        });
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

    public Button getKlahvLopetaOst() {
        return klahvLopetaOst;
    }


    public Button getKlahvUusOst () {
        return klahvUusOst;
    }

    /*public Button getKlahvLopetaPaev() {
        return klahvLopetaPaev;
    } */

}


