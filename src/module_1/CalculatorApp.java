package module_1;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        calculator();
    }

    public static void calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter symbol: ");
        String symbol = scanner.nextLine();

        //Meh. Qorx.
        System.out.print("First number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Second number: ");
        double secondNumber = scanner.nextDouble();

        switch (symbol) {
            case "+" :
                System.out.println(topla(firstNumber, secondNumber));//23
                break;
            case "-" :
                System.out.println(ferq(firstNumber, secondNumber));
                break;
            case "*" :
                System.out.println(hasil(firstNumber, secondNumber));
                break;
            case "/" :
                System.out.println(qismet(firstNumber, secondNumber));
                break;
        }
    }

    public static double topla(double a, double b) {
        return a + b;
    }

    public static double ferq(double a, double b) {
        return a - b;
    }

    public static double hasil(double a, double b) {
        return a * b;
    }

    public static double qismet(double a, double b) {
        if(b == 0) {
            throw new NullPointerException("Bolen 0 ola bilmez");
        }
        return a / b;
    }
}
