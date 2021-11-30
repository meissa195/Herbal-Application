import java.util.ArrayList;
import java.util.HashMap;

public class Garlic extends Herbs{
        private String garlic;



        //should I make the actions and qualities interfaces?
        public Garlic() {
            this.garlic = "Garlic";
            this.herbsList = new ArrayList<>();
        }

        @Override
        public String qualities() {
            return "The herb qualities are:\n "
                    + herbsList.get(0) + ", "
                    + herbsList.get(1) + ", "
                    + herbsList.get(2) + " and "
                    + herbsList.get(3) + ".";
        }



}
