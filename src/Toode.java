/**
 * Created by kaits on 29.10.2016.
 */
public class Toode {
    private String tooteNimi;
    private double tooteHind;

    public Toode() {

    }

    public Toode(String tooteNimi, double tooteHind) {
        this.tooteNimi = tooteNimi;
        this.tooteHind = tooteHind;
    }

    public String getTooteNimi() {
        return tooteNimi;
    }

    public void setTooteNimi(String tooteNimi) {
        this.tooteNimi = tooteNimi;
    }

    public double getTooteHind() {
        return tooteHind;
    }

    public void setTooteHind(Double tooteHind) {
        this.tooteHind = tooteHind;
    }
}
