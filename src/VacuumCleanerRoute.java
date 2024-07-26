import java.util.Scanner;

public class VacuumCleanerRoute {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean wishContinue = true;

        int x = 0;
        int y = 0;

        while (wishContinue) {
            System.out.println("Where do you want to move the robot?\n[ L ] Left\n[ R ] Right\n[ D ] Down\n[ U ] Up");
            String option = sc.nextLine().toUpperCase();
            switch (option) {
                case "L":
                    x--;
                    break;
                case "R":
                    x++;
                    break;
                case "D":
                    y--;
                    break;
                case "U":
                    y++;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            System.out.println("do you wish to continue? [s/n]");
            String choice = sc.nextLine().toLowerCase();
            wishContinue = choice.equals("s");
        }

        boolean returnedToTheSamePosition = x == 0 && y == 0;
        System.out.println("Did the robot return to the same position? " + returnedToTheSamePosition);

        sc.close();
    }
}
