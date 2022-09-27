package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    private final Scanner scanner = new Scanner(System.in);

    public void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    public void helloRobot() {
        String numberLine = "0123456789012345678901";
        String line1 = "         __";
        String line2 = " _(\\    |@@|";
        String line3 = "(__/\\__ \\--/ __";
        String line4 = "   \\___|----|  |   __";
        String line5 = "       \\ }{ /\\ )_ / _\\";
        String line6 = "       /\\__/\\ \\__O (__";
        String line7 = "      (--/\\--)    \\__/";
        String line8 = "      _)(  )(_";
        String line9 = "     `---''---`";
        System.out.println(numberLine);
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        System.out.println(line7);
        System.out.println(line8);
        System.out.println(line9);
    }

    public void sumOfLiterals() {
        int z = 'Z';
        int hex = 0xface;
        int octal = 012;
        int Long = (int) 80L;
        int Float1 = (int) 44e-1f;
        int Float2 = (int) 5.5f;
        int Double1 = (int) 8.88e1;
        int Double2 = (int) 99.9;
        int sum = z + hex + octal + Long + Float1 + Float2 + Double1 + Double2;
        System.out.println(sum);
    }

    public void addTwoNumbers() {
        int numberToAdd1 = scanner.nextInt();
        int numberToAdd2 = scanner.nextInt();
        int sum = numberToAdd1 + numberToAdd2;
        System.out.println(sum);
    }

    public void swapTwoNumbers() {
        System.out.println("Before Swap:");
        System.out.println("x: y:" + " After Swap:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public void compareTwoNumbers() {
        System.out.print("n1: ");
        int number1 = scanner.nextInt();
        System.out.print("n2: ");
        int number2 = scanner.nextInt();
        if (number1 == number2) {
            System.out.print("n1 == n2\n");
        } else {
            String result = number1 > number2 ? "n1 > n2" : "n2 > n1";
            System.out.print(result + "\n");
        }
    }

    public void ratingSalesPerson() {
        System.out.print("Enter annual Revenue: ");
        int annualRevenue = scanner.nextInt();
        if (annualRevenue < 0 || annualRevenue >= 100000) {
            System.out.print("Invalid Revenue\n");
        } else if (annualRevenue >= 0 && annualRevenue < 20000) {
            System.out.print("Poor Sales Revenue\n");
        } else if (annualRevenue >= 20000 && annualRevenue < 50000) {
            System.out.print("Average Sales Revenue\n");
        } else if (annualRevenue >= 50000 && annualRevenue < 80000) {
            System.out.print("Good Sales Revenue\n");
        } else {
            System.out.print("Excellent Sales Revenue\n");
        }
    }

    public void getCommissionRate() {
        System.out.print("Enter CommissionClass: ");
        int commissionClass = scanner.nextInt();
        String commissionRate = "";
        switch (commissionClass) {
            case 1:
                commissionRate = "0.01";
                break;
            case 2:
                commissionRate = "0.02";
                break;
            case 3:
                commissionRate = "0.03";
                break;
            case 4:
                commissionRate = "0.04";
                break;
            default:
                commissionRate = "0.0";
                break;
        }
        System.out.print("Your Commission Rate was set to " + commissionRate + "\n");
    }

    public void leapyear() {
        System.out.print("Year: ");
        int year = scanner.nextInt();
        boolean leapYear = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            leapYear = true;
        }
        String result = leapYear ? "Leapyear" : "Not a Leapyear";

        System.out.println(result);

    }

    public void transposedNumbers() {
        System.out.print("Number: ");
        String numberToInvert = scanner.next();
        StringBuilder stringBuilder = new StringBuilder(numberToInvert);
        System.out.print(stringBuilder.reverse() + "\n");
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}