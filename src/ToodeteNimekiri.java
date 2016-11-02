import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by kaits on 29.10.2016.
 */
public class ToodeteNimekiri {
    static ArrayList<Toode> tooted = new ArrayList<Toode>();

    public static void setTooted(ArrayList<Toode> tooted) {
        ToodeteNimekiri.tooted = tooted;
        tooted.add(new Toode("Sai", 2.60));
        tooted.add(new Toode());
    }


        static Toode toode1 = new Toode("Sai", 2.60);
        static Toode toode2 = new Toode("Leib", 1.40);
        static Toode toode3 = new Toode("Õunakook", 1.30);
        static Toode toode4 = new Toode("Kirsistruudel", 3.20);
        static Toode toode5 = new Toode("Kaneelisai", 0.70);
        static Toode toode6 = new Toode("Sefiirikorv", 0.90);
        static Toode toode7 = new Toode("Muffin", 1.00);
        static Toode toode8 = new Toode("Aleksandrikook", 1.20);
        static Toode toode9 = new Toode("Vahukoorekook", 1.80);
        static Toode toode10 = new Toode("Kapsapirukas", 0.80);
        static Toode toode11 = new Toode("Porgandipirukas", 0.80);
        static Toode toode12 = new Toode("Lihapirukas", 0.90);
        static Toode toode13 = new Toode("Viineripirukas", 0.90);
        static Toode toode14 = new Toode("Minipitsa", 0.90);
        static Toode toode15 = new Toode("Ekleer", 0.80);
        static Toode toode16 = new Toode("Moorapea", 0.70);
        static Toode toode17 = new Toode("Moskva sai", 0.70);
        static Toode toode18 = new Toode("Kohupiima korp", 0.80);
}
