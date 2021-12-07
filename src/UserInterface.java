import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private HerbList herbList;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.herbList = new HerbList();
    }

    public void askUser() {
        while (true) {
            System.out.println("What would you like to do today?");
            System.out.println("1. Add an herb.");
            System.out.println("2. Remove an herb.");
            System.out.println("3. Learn about an herb.");
            int input = scanner.nextInt();
            if (input == 1) {
                this.herbList.addToHerbList();
            } else if (input == 2) {
                this.herbList.removeFromHerbList();
            } else if (input == 3) {
                this.herbList.getHerbList();
            }
        }
    }
}