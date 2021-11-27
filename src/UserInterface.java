import java.util.Scanner;

//import java.util.Scanner;
//
public class UserInterface extends Herbs {

    private Scanner scanner;
    private Qualities qualities;
    private Actions actions;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.qualities = new Qualities();
        this.actions = new Actions();
    }

    public void userInput() {

        while (true) {
            System.out.println("What herb would you like to learn about?");
            String input = scanner.nextLine();
            if (input.equals("Garlic")) {
                super.addHerb(input);
                super.printHerb(input);
                qualities.whichQualities();
                actions.whichActions();
                break;
            } else
                System.out.println("Herb not found. Please enter another herb.");
            scanner.nextLine();
            break;
        }
    }
}
