
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Creating a User object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to ????\n1. Admin\n2. User\n3. Exit\nPlease select: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        

        // Maybe create a database at Admin class to store admin login details
        /*if (choice == 1) {
            System.out.println("Enter admin ID or email: ");
            String adminID = scanner.nextLine();

            System.out.println("Enter password: ");
            String password = scanner.nextLine();

            Admin admin1 = new Admin(adminID, password);

            //Displaying admin details
            System.out.println("Admin ID: " + admin1.getAdminID());

            //Testing methods
            if (admin1.verifyLogin()) {
                System.out.println("Login verified successfully.");
            }

            if (admin1.login()) {
                System.out.println("Admin logged in.");
            }

            if (admin1.logout()) {
                System.out.println("Admin logged out.");
            }
                
        }*/
        if (choice == 2) {
            System.out.print("1. Register\n2. Login\nPlease select: ");
            int userChoice = scanner.nextInt();
            scanner.nextLine();
            System.out.print("\033[H\033[2J");  
            System.out.flush();

            if (userChoice == 1) {
                System.out.print("Enter user ID or email: ");
                String userID = scanner.nextLine();

                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                String registerDate = LocalDate.now().toString();
                User user1 = new User(userID, password, registerDate);

            } else if (userChoice == 2) {
                System.out.println("Enter user ID or email: ");
                String userID = scanner.nextLine();

                System.out.println("Enter password: ");
                String password = scanner.nextLine();

                User user1 = new User(userID, password, "");

                //Testing methods
                if (user1.verifyLogin()) {
                    System.out.println("Login verified successfully.");
                }

                if (user1.login()) {
                    System.out.println("User logged in.");
                }

                if (user1.logout()) {
                    System.out.println("User logged out.");
                }
            } else {
                System.out.println("Invalid choice.");
            }

        } else {
            System.out.println("Exiting...");
        }

        scanner.close();
    }
}
