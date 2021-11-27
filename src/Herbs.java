import java.util.HashMap;
import java.util.Objects;

public class Herbs {

    private HashMap<String, Object> herbLookUp;
    private Object object; //this can be used to input any herb which will be an object from a different class
    private Qualities qualities;

    public Herbs() {
        this.herbLookUp = new HashMap<>();
        this.object = new Garlic();
    }

    public void addHerb(String herb) {
        this.herbLookUp.put(herb, object);
    }

    public void printHerb(String herb) {
        addHerb(herb);
        System.out.println(this.herbLookUp.get(herb.toString()));
    }
}
