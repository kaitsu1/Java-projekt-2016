import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by kaits on 29.10.2016.
 */
public class Pood {
    public static void main(String[] args) {

        ArrayList<Toode> ostukorv = new ArrayList<Toode>();
        ListIterator<Toode> i = ToodeteNimekiri.tooted.listIterator();
        while (i.hasNext()){
            System.out.println(i.next().getTooteNimi());
        }


       // ostukorv.add(ToodeteNimekiri.toode1);
/*
        ListIterator<Toode> i = ostukorv.listIterator();
        while (i.hasNext()){
            System.out.println(i.next().getTooteNimi());
        }
*/

    }
}
