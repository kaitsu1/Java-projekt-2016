import java.util.Scanner;

/**
 * Created by kaits on 15.10.2016.
 */
public class Tooted {
    public static void main(String[] args) {
        Scanner klaviatuur = new Scanner(System.in);
        System.out.println("Vali toode ja vajuta sisesta ");
        String toode = klaviatuur.nextLine();

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

        System.out.println("Arvutan ostusumma");
        /* int tootehind = klaviatuur.nextInt();
        int ostusumma = tootehind * kogus;
        */

        System.out.println("Sisesta saadud rahasumma");
        double saadudraha = klaviatuur.nextInt();

        /* arvutan tagasiantava summma
        int tagastatavRaha = saadudraha - */


    }


}
