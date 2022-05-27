package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        // 1 uzdevums
        //a
        int x = 6;
        System.out.println(x >= 0); // true

        //b
        x = -8;
        System.out.println(x >= 0); //true

        //c
        x = 7;
        System.out.println(x > 5 && x <= 10); // true

        //d
        x = 9;
        System.out.println(x > 5 && x <= 10); // true

        //e
        x = 11;
        System.out.println(x == 0 || x == 10); // true

        //f
        x = 4;
        System.out.println(x * x > 10); // true

        //2 uzdevums
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number 1 - 12");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("January!");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Not incorrect month of the year!");
        }

        //3 uzdevums
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter 1 number");
        int firstNumber = scanner1.nextInt();
        System.out.println("Please enter 2 number");
        int secondNumber = scanner1.nextInt();
        System.out.println("Please enter 3 number");
        int thirdNumber = scanner1.nextInt();
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println(secondNumber);
        } else {
            System.out.println(thirdNumber);
        }

        //4 uzdevums
        Scanner scanner2 = new Scanner(System.in);
        String color;
        System.out.println("Please type one of the colors: red, yellow or green");
        color = scanner2.nextLine();
        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Wait");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Wrong color");
                break;
        }

        //5 uzdevums
        System.out.println(" Businesscard \n ******************");
        printBusinessCard("Julija", "Hmelnicka", 27606912, 1986);
        System.out.println(" ******************");
        System.out.println(" Businesscard \n ******************");
        printBusinessCard("Julija", "Hmelnicka", 27606912, 1986);
        System.out.println(" ******************");
        System.out.println(" Businesscard \n ******************");
        printBusinessCard("Julija", "Hmelnicka", 27606912, 1986);
        System.out.println(" ******************");

        //6 uzdevums
        System.out.println(" Businesscard \n ******************");
        printBusinessCardTwo("John", "Bold", 5849612, 1974);
        System.out.println(" ******************");
        System.out.println(" Businesscard \n ******************");
        printBusinessCardTwo("Sarah", "White", 1875462, 2005);
        System.out.println(" ******************");

        //7 uzdevums
        int summa = sum(6, 9);
        System.out.println(summa);

        //8 uzdevums
        System.out.println(average(10,2,4));

    }
    //5 uzd
    public static void printBusinessCard(String name, String surname, int phone, int year) {
        System.out.printf(" Name: %s\n Surname: %s\n Phone: %s\n Year: %s\n", name, surname, phone, year);

    }
    //6 uzd
    public static void printBusinessCardTwo(String name, String surname, int phone, int year) {
        System.out.printf(" Name: %s\n Surname: %s\n Phone: %s\n Year: %s\n", name, surname, phone, year);
    }
    //7 uzd
    public static int sum(int a, int b) {
        return a + b;
    }

    //8 uzd
    public static double average(double x, double y, double z) {
        return (x + y + z)/3;
    }

}