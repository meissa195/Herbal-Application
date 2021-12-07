import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HerbList {
    public ArrayList<String> herbList;
    public HashMap<String, String> qualities;

    public HerbList() {
        this.herbList = new ArrayList<>();
        this.qualities = new HashMap<>();
    }

    public void setHerbList() {
    }

    public void addToHerbList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What herb would you like to add to the list?");
        while (true) {
            String herb = scanner.nextLine(); //break point if red
            if (!this.herbList.contains(herb)) {
                this.herbList.add(herb);
                System.out.println("Add its qualities:");
                String qualities = scanner.nextLine();
                this.qualities.put(herb,qualities);
//                System.out.println("The herb you added is " + herb + ", and its qualities are:\n" + this.qualities.get(herb));
                System.out.println("Would you like to add another herb? Type 'yes' or 'no'");
                String response = scanner.nextLine();
                if(response.equals("yes")) {
                    System.out.println("What herb would you like to also add?");
                    continue;
                } else if (response.equals("no")) {
                    break;
                } else if (!response.equals("yes") || response.equals("no")) {
                    System.out.println("Response not recognized. Would you still like to remove an herb?");
                    String response2 = scanner.nextLine();
                    if (response2.equals("yes")) {
                        continue;
                    } else if (response2.equals("no")) {
                        break;
                    }
                }
            } else
                break;
        }
            System.out.println("\nHerb already added.");
            System.out.println("The herbs you added are:\n");
            for (String herb : this.herbList) {
                System.out.println(herb + " - " + this.qualities.get(herb) +"\n");
            }
    }
    public void removeFromHerbList() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What herb would you like to remove from the list?");
            for (String list : this.herbList) {
                System.out.println(list);
            }
            String herb = scanner.nextLine();
            if (this.herbList.contains(herb)) {
                System.out.println("Are you sure you want to remove " + herb + " that has qualities: " + this.qualities.get(herb) + "?");
                String response = scanner.nextLine();
                if(response.equals("yes")) {
                    this.herbList.remove(herb);
                    System.out.println("The herb has been removed!");
                    System.out.println("Would you like to remove another herb?");
                    String response1 = scanner.nextLine();
                    if (response1.equals("yes")) {
                        continue;
                    } else if (response1.equals("no")) {
                        System.out.println();
                        break;
                    } else if (!response1.equals("yes") || response1.equals("no")) {
                        System.out.println("Response not recognized. Please try again.");
                        continue;
                    }
                    System.out.println("Herb has not been removed.");
                }
            } else if (this.herbList.isEmpty())
                System.out.println("Herb is not on the list.");
                break;
        }
    }

    public void getHerbList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which herb would you like to learn about?");
        for (String herb : herbList) {
            System.out.println(herb);
            if (scanner.nextLine().equalsIgnoreCase(herb)) {
                System.out.println(herb + " has the following qualities: " + qualities.get(herb));
            } else
                System.out.println("Herb not found!");
        }
    }
    public void addToQualities(String qualities) {
        for (int i = 0; i < this.herbList.size(); i++) {
            this.qualities.put(this.herbList.get(i), qualities);
        }
    }
}
