import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UserInterface {
    public static class Ask {
        public Scanner scanner;
        public String whatUserWantsToDo;
        public Main.UserInterface userInterface;

        public Ask() {
            this.scanner =  new Scanner(System.in);
            this.whatUserWantsToDo = "";
            this.userInterface = new Main.UserInterface();
        }

        public void askUser() {
            System.out.println("What would you like to do?");
            System.out.println("1. Learn about an existing herb\n2. Add an herb\n3. Remove an herb");
            this. = this.scanner.nextLine();
            if (this.whatUserWantsToDo.equalsIgnoreCase("Learn about an existing herb")) {
                userInterface.askWhichHerb();
            } if (this.whatUserWantsToDo.equalsIgnoreCase("Add an herb")) {
                userInterface.askWhichHerb();
            } if (this.whatUserWantsToDo.equalsIgnoreCase("Remove an herb")) {
                userInterface.askWhichHerb();
            } else
                System.out.println("Invalid entry!");
        }

        public void askWhichHerb() {
            System.out.println("What herb would you like to learn about?");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("garlic")) {
                //how do I set it up where if they input anything, it returns what they are looking for?
                System.out.println("What would you like to learn about?\n>Actions\n>Qualities");
                String response = scanner.nextLine().toLowerCase();
                if (herbQualities.containsKey(response)) {
                    System.out.println(herbQualities.get(response));
                } else if (herbActions.containsKey(response)) {
                    System.out.println(herbActions.get(response));
                } else
                    System.out.println("No qualities or actions found.");

            } else
                System.out.println("Herb not found.");

        //add herbs to database


    }
}
