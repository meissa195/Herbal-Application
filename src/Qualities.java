import java.util.ArrayList;

public class Qualities extends Actions {
    public ArrayList<String> quality;
    private Object object;


    public Qualities() {
        this.quality = new ArrayList<>();
        this.quality.add("Cold");
        this.quality.add("Hot");
        this.quality.add("Dry");
        this.quality.add("Moist");
    }
    public void whichQualities() {
        if (object.equals(new Garlic())) {
            System.out.println("The herb is " + this.quality.get(1) + " and " + this.quality.get(2) + ".");
        } else
            System.out.println("The qualities for the herb inputted are unknown.");
    }
}
