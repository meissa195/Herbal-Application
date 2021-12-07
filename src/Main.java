import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    //main questions - how to create a database where I look up and item it returns the qualities and actions
    //how to make the database herb independent - meaning if I look any herb it will provide the information (Hashmap?)
    //how to connect them all? Inheritance, abstract or interface?
    //add options to learn about existing herb or add or remove an herb

    public static void main(String[] args) {
        //be able to control add and remove, have folks only learn (admin vs user access)
        // have an herb list
        //be able to add and remove from the list
        //be able to access an herb from the list and its associated qualities
        //be able to show the list of herbs
        //get a database connected - look into mongo or SQL (structured table), JDBC for local storage?
       UserInterface userInterface = new UserInterface();
       userInterface.askUser();
    }
}

    //should this have qualities and actions because every herb has them? Also, note that a garlic is an herb
    //there it should extend the Herbs class



    //ask if they want to learn, remove, or add


//    //why do I have to make this static?
//    public static class UserInterface {
//
//        public Garlic garlic = new Garlic();
//
//
//
//        //user interface that asks for herb of interest?
//
//
//
////                //then asks what would you like to know the herb?
////                ArrayList<String> qualities = new ArrayList<>();
////                qualities.add("Hot");
////                qualities.add("Cold");
////                qualities.add("Dry");
////                qualities.add("Moist");
//            }
//
//            public void addAnHerb() {
//
//            }
//
//            public void removeAnHerb() {
//
//            }
//
//        }
//    }
//}

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

