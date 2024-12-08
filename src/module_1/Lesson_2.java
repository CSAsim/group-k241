package module_1;

import java.util.Scanner;

public class Lesson_2 {
    public static void main(String[] args) {

//        //Logical operators --> && ||
//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//        if (age == 6) {
//            System.out.println("1-ci sinif");
//        } else if (age < 6) {
//            System.out.println("Bagcaliq");
//        } else if (age > 6 && age < 18) {
//            System.out.println("Mektebli");
//        } else {
//            System.out.println("Yetiskin");
//        }

        //CTRL + ALT + L
//
//
//        //switch-case
//
//        Scanner scan = new Scanner(System.in);
//        String text = scan.nextLine();
//
//        switch (text) {
//            case "Salam":
//                System.out.println("case-1");
//            case "Axsamin xeyir":
//                System.out.println("case-2");
//        }
//        System.out.println("bitdi");
//        //hecne  hecne hecne

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many student do you want to add?: ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            scanner = new Scanner(System.in);
            System.out.print("Name: ");
            String name = scanner.nextLine();//Salam

            scanner = new Scanner(System.in);
            System.out.print("Surname: ");
            String surname = scanner.nextLine();
        }
        System.out.println("Daxil edildi");
    }

}
