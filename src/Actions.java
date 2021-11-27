import java.util.ArrayList;

public class Actions {

   private ArrayList<String> actions;
   private Object object;

   public Actions() {
       this.actions = new ArrayList<>();
       actions.add("Antibacterial");
       actions.add("Anti-inflammatory");
       actions.add("Stomachic");
       actions.add("Bitter");
       actions.add("Tonic");
       actions.add("Hypotensive");
       actions.add("Vasodilator");
       actions.add("Vasoconstrictor");
       actions.add("Nervine");
       actions.add("Sedative");
       actions.add("Adaptogenic");
       actions.add("Anti-emetic");
       actions.add("Carminative");
       this.object = new Garlic();
   }
    public void whichActions() {
        if (object.equals(new Garlic())) {
            System.out.println("The herb is " + this.actions.get(0) + ", " + this.actions.get(1) + ", " + this.actions.get(2) + ", " + this.actions.get(6) + ", and " + this.actions.get(7) + ".");
        } else
            System.out.println("The actions for the herb inputted are unknown.");
    }
}

