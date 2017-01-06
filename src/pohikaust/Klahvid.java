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
    //muutujad iga toote positsiooni määramiseks ostunimekirjas, algväärtustatakse esimesel nupuvajutusel
    int asukoht1 = -1, asukoht2 = -1, asukoht3 = -1, asukoht4 = -1, asukoht5 = -1, asukoht6 = -1, asukoht7 = -1;
    //muutujad iga toote loendamiseks, kui toote nupule vajutatakse rohkem kui korra, samuti lõpphinna arvutamiseks
    int loendur1 = 0, loendur2 = 0, loendur3 = 0, loendur4 = 0, loendur5 = 0, loendur6 = 0;

    public Klahvid(TextArea ostuNimekiri) {

        ImageView klahv1 = new ImageView(new Image("pohikaust/pildid/kohupiimasai.png"));
        kohupiimaSai = new Button("", klahv1);
        double price1 = 0.39; //toote hind
        kohupiimaSai.setOnAction(event -> {
            loendur1++; //loendab toote nupule vajutamisi
            String nimekiri1 = loendur1 +"x Kohupiimapirukas "+price1+"€"; //koostab ostunimekirja mineva teksti
            if (loendur1 < 10) nimekiri1 = nimekiri1+"  ";
            if (10<= loendur1 && loendur1 <100) nimekiri1 = nimekiri1+" ";
            nimekiri1=nimekiri1+"\n"; //iga toode eraldi real
            if (asukoht1 == -1) {
                asukoht1 = ostuNimekiri.getLength(); //algväärtustame toote teksti asukoha ostunimekirjas
                ostuNimekiri.appendText(nimekiri1); //lisame toote teksti ostunimekirja
            }
            //kui toode oli juba nimekirjas, muudame tekstis toodete arvu
            else ostuNimekiri.replaceText(asukoht1, (asukoht1 +nimekiri1.length()), nimekiri1);
        });
        kohupiimaSai.setPadding(Insets.EMPTY);
        kohupiimaSai.setStyle("-fx-background-color: transparent");

        //klahv2-klahv6 on sama loogikaga nagu klahv1
        ImageView klahv2 = new ImageView(new Image("pohikaust/pildid/rosinasai.png"));
        rosinaSai = new Button("", klahv2);
        double price2 = 0.30;
        rosinaSai.setOnAction(event -> {
            loendur2++;
            String nimekiri2 = loendur2 +"x Rosinasai "+price2+"€";
            if (loendur2 < 10) nimekiri2 = nimekiri2+"  ";
            if (10<= loendur2 && loendur2 <100) nimekiri2 = nimekiri2+" ";
            nimekiri2=nimekiri2+"\n";
            if (asukoht2 == -1) {
                asukoht2 = ostuNimekiri.getLength();
                ostuNimekiri.appendText(nimekiri2);}
            else ostuNimekiri.replaceText(asukoht2, (asukoht2 +nimekiri2.length()), nimekiri2);
        });
        rosinaSai.setPadding(Insets.EMPTY);
        rosinaSai.setStyle("-fx-background-color: transparent");

        ImageView klahv3 = new ImageView(new Image("pohikaust/pildid/moonirull.png"));
        mooniRull = new Button("", klahv3);
        double price3 = 0.36;
        mooniRull.setOnAction(event -> {
            loendur3++;
            String nimekiri3 = loendur3 +"x Moonirull "+price3+"€";
            if (loendur3 < 10) nimekiri3 = nimekiri3+"  ";
            if (10<= loendur3 && loendur3 <100) nimekiri3 = nimekiri3+" ";
            nimekiri3=nimekiri3+"\n";
            if (asukoht3 == -1) {
                asukoht3 = ostuNimekiri.getLength();
                ostuNimekiri.appendText(nimekiri3);}
            else ostuNimekiri.replaceText(asukoht3, (asukoht3 +nimekiri3.length()), nimekiri3);
        });
        mooniRull.setPadding(Insets.EMPTY);
        mooniRull.setStyle("-fx-background-color: transparent");

        ImageView klahv4 = new ImageView(new Image("pohikaust/pildid/kaneelirull.png"));
        kaneeliRull = new Button("", klahv4);
        double price4 = 0.32;
        kaneeliRull.setOnAction(event -> {
            loendur4++;
            String nimekiri4 = loendur4 +"x Kaneelirull "+price4+"€";
            if (loendur4 < 10) nimekiri4 = nimekiri4+"  ";
            if (10<= loendur4 && loendur4 <100) nimekiri4 = nimekiri4+" ";
            nimekiri4=nimekiri4+"\n";
            if (asukoht4 == -1) {
                asukoht4 = ostuNimekiri.getLength();
                ostuNimekiri.appendText(nimekiri4);}
            else ostuNimekiri.replaceText(asukoht4, (asukoht4 +nimekiri4.length()), nimekiri4);
        });
        kaneeliRull.setPadding(Insets.EMPTY);
        kaneeliRull.setStyle("-fx-background-color: transparent");

        ImageView klahv5 = new ImageView(new Image("pohikaust/pildid/dallasesai.png"));
        dallaseSai = new Button("", klahv5);
        double price5 = 0.56;
        dallaseSai.setOnAction(event -> {
            loendur5++;
            String nimekiri5 = loendur5 +"x Dallase sai "+price5+"€";
            if (loendur5 < 10) nimekiri5 = nimekiri5+"  ";
            if (10<= loendur5 && loendur5 <100) nimekiri5 = nimekiri5+" ";
            nimekiri5=nimekiri5+"\n";
            if (asukoht5 == -1) {
                asukoht5 = ostuNimekiri.getLength();
                ostuNimekiri.appendText(nimekiri5);}
            else ostuNimekiri.replaceText(asukoht5, (asukoht5 +nimekiri5.length()), nimekiri5);
        });
        dallaseSai.setPadding(Insets.EMPTY);
        dallaseSai.setStyle("-fx-background-color: transparent");

        ImageView klahv6 = new ImageView(new Image("pohikaust/pildid/moskvasai.png"));
        moskvaSai = new Button("", klahv6);
        double price6 = 0.37;
        moskvaSai.setOnAction(event -> {
            loendur6++;
            String nimekiri6 = loendur6 +"x Moskva sai "+price6+"€";
            if (loendur6 < 10) nimekiri6 = nimekiri6+"  ";
            if (10<= loendur6 && loendur6 <100) nimekiri6 = nimekiri6+" ";
            nimekiri6=nimekiri6+"\n";
            if (asukoht6 == -1) {
                asukoht6 = ostuNimekiri.getLength();
                ostuNimekiri.appendText(nimekiri6);}
            else ostuNimekiri.replaceText(asukoht6, (asukoht6 +nimekiri6.length()), nimekiri6);
        });
        moskvaSai.setPadding(Insets.EMPTY);
        moskvaSai.setStyle("-fx-background-color: transparent");

        // klahv "Lõpeta ost" lööb ostunimekirja kokku ja keelab edasise toodete lisamise
        ImageView lopeta = new ImageView(new Image("pohikaust/pildid/lopeta.png"));
        klahvLopetaOst = new Button("", lopeta);
        klahvLopetaOst.setOnAction(event -> {
            //hinna viisakaks ümardamiseks kasutame kümnendmurru formaati, kaks kohta pärast koma
            DecimalFormat df = new DecimalFormat("###.##");
            //ostukorvi kogusumma jaoks korrutame toodete hinna loendatud nupuvajutuste arvuga
            //kui mõnd toodet ei valitud, on selle loendur 0 nagu algul defineeritud
            double kokku = (loendur1 *price1+ loendur2 *price2+ loendur3 *price3+ loendur4 *price4+ loendur5 *price5+ loendur6 *price6);
            String nimekiri7 = "\n Kokku: "+ df.format(kokku)+"€\n";//koostame lõpphinna teksti
            //keelame tooteklahvide kasutamise, kuna ostukorv on suletud
            kohupiimaSai.setDisable(true);
            rosinaSai.setDisable(true);
            mooniRull.setDisable(true);
            kaneeliRull.setDisable(true);
            dallaseSai.setDisable(true);
            moskvaSai.setDisable(true);
            //paigutame lõpphinna teksti ostunimekirja lõppu
            if (asukoht7 == -1) {
                asukoht7 = ostuNimekiri.getLength();
                ostuNimekiri.appendText(nimekiri7);}
            else ostuNimekiri.replaceText(asukoht7, (asukoht7 +nimekiri7.length()), nimekiri7);
        });
        klahvLopetaOst.setPadding(Insets.EMPTY);
        klahvLopetaOst.setStyle("-fx-background-color: transparent");

        //Klahv "Uus ost" tühjendab olemasoleva ostunimekirja ja võimaldab uuesti tootenuppude kasutamise
        ImageView uus = new ImageView(new Image("pohikaust/pildid/uus.png"));
        klahvUusOst = new Button("", uus);
        klahvUusOst.setOnAction(event -> {
            ostuNimekiri.setText("");//tühjendame ostunimekirja teksti
            //võimaldame tootenuppude kasutamise
            kohupiimaSai.setDisable(false);
            rosinaSai.setDisable(false);
            mooniRull.setDisable(false);
            kaneeliRull.setDisable(false);
            dallaseSai.setDisable(false);
            moskvaSai.setDisable(false);
            //taastame positsiooni ja loenduri muutujate algväärtused
            asukoht1 = -1; asukoht2 = -1; asukoht3 = -1; asukoht4 = -1; asukoht5 = -1; asukoht6 = -1; asukoht7 = -1;
            loendur1 = 0; loendur2 = 0; loendur3 = 0; loendur4 = 0; loendur5 = 0; loendur6 = 0;
        });
        klahvUusOst.setPadding(Insets.EMPTY);
        klahvUusOst.setStyle("-fx-background-color: transparent");
    }

    public Button getKohupiimaSai() {
        return kohupiimaSai;
    }

    public Button getRosinaSai() {
        return rosinaSai;
    }

    public Button getMooniRull() {
        return mooniRull;
    }

    public Button getKaneeliRull() {
        return kaneeliRull;
    }

    public Button getDallaseSai() {
        return dallaseSai;
    }

    public Button getMoskvaSai() {
        return moskvaSai;
    }

    public Button getKlahvLopetaOst() {
        return klahvLopetaOst;
    }

    public Button getKlahvUusOst () {
        return klahvUusOst;
    }

}