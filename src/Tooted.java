import java.util.Scanner;

/**
 * Created by kaits on 15.10.2016.
 */
public class Tooted {
    public static void main(String[] args) {
        Scanner klaviatuur = new Scanner(System.in);
        System.out.println("Vali toode ja vajuta sisesta ");
        String toode = klaviatuur.nextLine();
        int saadudRaha;
        int ostuSumma;

        String toode1 = "moskva sai";
        String toode2 = "kohupiima korp";
        String toode3 = "õunakook";
        String toode4 = "kirsistruudel";
        String toode5 = "kaneelisai";
        String toode6 = "sefiirikorv";
        String toode7 = "muffin";
        String toode8 = "aleksandrikook";
        String toode9 = "vahukoorekook";
        String toode10 = "kapsapirukas";
        String toode11 = "porgandipirukas";
        String toode12 = "lihapirukas";
        String toode13 = "viineripirukas";
        String toode14 = "minipitsa";
        String toode15 = "ekleer";
        String toode16 = "moorapea";

        System.out.println("Sisesta kogus- mitu tk?");
        int kogus = klaviatuur.nextInt();

        //arvutan ostusumma
        System.out.println("Arvutan ostusumma");

        int tootehind = 1;
        ostuSumma = kogus * tootehind;
        System.out.println(ostuSumma);


        System.out.println("Sisesta saadud rahasumma");
        saadudRaha = klaviatuur.nextInt();

        //kas on vaja tagasi anda või juurde küsida?
 /*       int SaadudRaha = 101;
        int ostuSumma = 100;*/
        int rahaTagasi = saadudRaha - ostuSumma;
        if (saadudRaha == ostuSumma) {
            System.out.println("Täname ostu eest!");
         } else if (saadudRaha < ostuSumma) {
             System.out.println("Küsi raha juurde!");
         } else if (saadudRaha > ostuSumma) {
            System.out.println("Anna tagasi");
            int tagastatavRaha = saadudRaha - ostuSumma;
            System.out.println(tagastatavRaha);
         }

        // arvutan tagasiantava summma System.out.println("Tagasiantav summa");




    }


}
