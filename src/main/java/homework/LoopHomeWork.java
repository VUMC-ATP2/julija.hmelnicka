package homework;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {

        // 1 uzdevums

        Scanner scan = new Scanner(System.in);
        int numSum = 0;
        int n;
        while (numSum < 100) {
            System.out.println("Please enter number: ");
            n = scan.nextInt();
            numSum = numSum + n;
        }
        System.out.println("Ready");

        System.out.println(" ");

        // 2 uzdevums

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int input = scanner.nextInt();
        int count = 0;
        int divider = 1;

        while (divider <= input) {
            if (input % divider == 0)
                count++;
            divider++;
        }
        if (count == 2)
            System.out.println(input + " - is prime number");
        else
            System.out.println(input + " - non prime number");

        System.out.println(" ");

        // 3 uzdevums
        //int type

        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //while

        int num = 0;
        while (num < numArray.length) {
            System.out.println(numArray[num]);
            num++;
        }

        //do while

        num = 0;
        do {
            System.out.println(numArray[num]);
            num++;
        }
        while (num < numArray.length);

        //for loop

        for (num = 0; num < numArray.length; num++) {
            System.out.println(numArray[num]);
        }

        //for each

        for (int number : numArray) {
            System.out.println(number);
        }

        System.out.println(" ");

        //String type

        String[] dayOfTheWeek = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        //while

        int day = 0;
        while (day < dayOfTheWeek.length) {
            System.out.println(dayOfTheWeek[day]);
            day++;
        }

        //do while

        day = 0;
        do {
            System.out.println(dayOfTheWeek[day]);
            day++;
        }
        while (day < dayOfTheWeek.length);

        //for loop

        for (day = 0; day < dayOfTheWeek.length; day++) {
            System.out.println(dayOfTheWeek[day]);
        }

        //for each

        for (String weekDays : dayOfTheWeek) {
            System.out.println(weekDays);
        }

        System.out.println(" ");

        //char type

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

        //while

        num = 0;
        while (num < alphabet.length) {
              System.out.println(alphabet[num]);
              num++;
          }

        //do while

        num = 0;
        do {
            System.out.println(alphabet[num]);
            num++;
        }
        while (num < alphabet.length);

        //for loop

        for (num = 0; num < alphabet.length; num++) {
            System.out.println(alphabet[num]);
        }

        //for each

        for (char alph : alphabet) {
            System.out.println(alph);
        }

        System.out.println(" ");

        // 4 uzdevums
        int[] numArr = new int[100];
        for (int i = 0; i <= numArr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println(" ");
        // 5 uzdevums

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter factorial number: ");
        int N = in.nextInt();
        int fac = 1;
        for (int i = N; i > 0; i--) {
            fac = fac * i;
        }
        System.out.println(fac);

        //6 uzdevums

        int tries = 1;
        int pinNum = 4082;
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter your PIN (****) number: ");
        int inPin = scanner2.nextInt();
        while (inPin != pinNum && tries < 3) {
            System.out.println("Sorry, incorrect PIN number, please try again");
            System.out.println("Please enter your PIN number: ");
            inPin = scanner.nextInt();
            tries++;
        }
        if (inPin != pinNum && tries == 3) {
            System.out.println("Sorry, you have been blocked");
        } else {
            System.out.println("PIN number is accepted, welcome back");
        }

    }
}
