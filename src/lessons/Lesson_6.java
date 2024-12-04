package lessons;

import java.util.Random;
import java.util.Scanner;

public class Lesson_6 {

    public static void main(String[] args) {
        final String username = "user1";
        final String password = "u123";
        int attempt = 3;
        int gameAttempt = 5;
        Random random = new Random();
        int randomNumber = random.nextInt(0, 10);

        String menu = """
                1. Login
                2. Exit
                Please chose any process:
                """;
        System.out.print(menu);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean status = false;


        while (true) {
            if(number == 1 && !status) {
                scanner = new Scanner(System.in);
                System.out.print("username: ");
                String uname = scanner.nextLine();

                scanner = new Scanner(System.in);
                System.out.print("Password: ");
                String passwd = scanner.nextLine();

                if(username.equals(uname) && password.equals(passwd)) {
                    System.out.println("Correct");
                    status = true;
                    System.out.println("Game started");
                } else {
                    System.out.println("Username or password is incorrect." +
                            " Please try again...");
                    attempt--;
                    System.out.println("Your attempt: " + attempt);
                    if(attempt == 0) {
                        System.out.println("Your attempt is over");
                        break;
                    }
                }
            } else if (number == 2) {
                break;
            }
            System.out.print("Please type wanted number: ");
            scanner = new Scanner(System.in);
            int wantedNumber = scanner.nextInt();

            if(wantedNumber == randomNumber) {
                System.out.println("You are winner");
                break;
            } else {
                gameAttempt--;
                System.out.println("Incorrect Number. Your attempt: " + gameAttempt);
            }
        }
        System.out.println("Process is over");
    }
}
