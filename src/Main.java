import java.sql.SQLOutput;
import java.util.*;

public class Main {
    //main questions - how to create a database where I look up and item it returns the qualities and actions
    //how to make the database herb independent - meaning if I look any herb it will provide the information (Hashmap?)
    //how to connect them all? Inheritance, abstract or interface?

    public static void main(String[] args) {
        ArrayList<String> herbs = new ArrayList<>();
        herbs.add("Garlic");
        herbs.add("Anise");
        herbs.add("Chamomile");
        herbs.add("Ginger");
        herbs.add("Fenugreek");

        HashMap<String, String> herbDatabase = new HashMap<>();

        herbDatabase.put("garlic", herbs.get(0).toLowerCase());
        herbDatabase.put("anise", herbs.get(1).toLowerCase());
        herbDatabase.put("chamomile", herbs.get(2).toLowerCase());


        //user interface that asks for herb of interest?
        System.out.println("What herb would you like to learn about?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("garlic")) {
            System.out.println(herbDatabase.get("garlic"));
        } else
            System.out.println("Herb not found.");

        //then asks what would you like to know the herb?
        ArrayList<String> qualities = new ArrayList<>();
        qualities.add("Hot");
        qualities.add("Cold");
        qualities.add("Dry");
        qualities.add("Moist");

        class Garlic {
            private String garlic;
            private ArrayList<String> qualities; //every herb has qualities
            private ArrayList<String> actions; //every herb has actions

            public Garlic() {
                this.garlic = "Garlic";

                //list of qualities
                this.qualities = new ArrayList<>();
                qualities.add("Hot");
                qualities.add("Cold");
                qualities.add("Dry");
                qualities.add("Moist");

                //list of actions
                this.actions = new ArrayList<>();
//                actions.add("")

            }

            public String printActions() {
                return "The actions are:\n " + "list actions here.";
            }

            public String printQualities() {
                return "The qualities are: " + qualities.get(0) + " and " + qualities.get(2) + ".";
            }
        }

        System.out.println("What would you like to know about the herb?");
        String input1 = scanner.nextLine();
        if (input1.equalsIgnoreCase("qualities")) {
            System.out.println(new Garlic()); //later on add the degree of quality
        } else
            System.out.println("The herb has no specified qualities.");
    }
}
