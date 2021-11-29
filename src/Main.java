import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    //main questions - how to create a database where I look up and item it returns the qualities and actions
    //how to make the database herb independent - meaning if I look any herb it will provide the information (Hashmap?)
    //how to connect them all? Inheritance, abstract or interface?

    public static void main(String[] args) {
        UserInterface input = new UserInterface();
        input.setHerbs();
        input.askWhichHerb();

    }

    static class UserInterface {
        private ArrayList<Object> herbs;
        private HashMap<String, Object> herbDatabase;


        public UserInterface() {
            this.herbs = new ArrayList<>();
            this.herbDatabase = new HashMap<>();

        }

        //add herbs to database
        public void setHerbs() {
            //first add herbs to a list
            herbs.add(new Garlic().qualities());
            herbs.add("Anise");
            herbs.add("Chamomile");
            herbs.add("Ginger");
            herbs.add("Fenugreek");

            //use hashmap to reference list
            herbDatabase.put("garlic", herbs.get(0)); // should return Garlic, where it will contain actions and qualities
        }

        //user interface that asks for herb of interest?
        public void askWhichHerb() {
            System.out.println("What herb would you like to learn about?");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine().toLowerCase();
            if (!input.isEmpty()) { //how do I set it up where if they input anything, it returns what they are looking for?
                System.out.println("What would you like to learn about the herb?");
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("qualities")) {
                    System.out.println(herbDatabase.get(input));
                } else
                    System.out.println("No qualities found.");
            } else
                System.out.println("Herb not found.");

//                //then asks what would you like to know the herb?
//                ArrayList<String> qualities = new ArrayList<>();
//                qualities.add("Hot");
//                qualities.add("Cold");
//                qualities.add("Dry");
//                qualities.add("Moist");

        }
    }


    static class Garlic {
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
        }

        public String qualities() {
            return "The herbs qualities are:\n "
                    + qualities.get(0) + " and "
                    + qualities.get(2) + ".";
        }
    }
}

//                class Action {
//
//                    public ArrayList<String> actions;
//                    public Garlic garlic;
//
//                    public Action() {
//                        this.garlic = new Garlic();
//
//                        this.actions = new ArrayList<>();
//                        actions.add("Adaptogen");
//                        actions.add("Astringent");
//                        actions.add("Bitter");
//                        actions.add("Cardiac Remedy");
//                        actions.add("Cholagogue");
//                        actions.add("Demulcent");
//                        actions.add("Diuretic");
//                        actions.add("Emmenagogue");
//                        actions.add("Expectorant");
//                        actions.add("Hepatic");
//                        actions.add("Nervine");
//                        actions.add("Sedative");
//                    }

//                    public void getQuality() {
//                        Scanner scanner = new Scanner(System.in);
//                        String input = scanner.nextLine();
//                        while (input.equalsIgnoreCase("qualities")) {
//                            System.out.println("");
//                            if (input.equalsIgnoreCase())
//                                System.out.println("The qualities for the herb are:\n" +);
//                        }
//                    }
//
//
//                    public String printActions() {
//                        return "The actions are:\n " + "list actions here.";
//                    }
//
//                    public String printQualities() {
//                        return "The qualities are: " + qualities.get(0) + " and " + qualities.get(2) + ".";
//                    }
//                }
//
//        System.out.println("What would you like to know about the herb?");
//                String input1 = scanner.nextLine();
//        if(input1.equalsIgnoreCase("qualities"))
//
//                {
//                    System.out.println(new Garlic()); //later on add the degree of quality
//                } else
//                        System.out.println("The herb has no specified qualities.");
//            }
//        }

