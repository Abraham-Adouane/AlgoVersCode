package training.afpa.cda24060.methode;

import java.util.Scanner;

public class UserInput {
    public static int userInput(String msg) {
        Scanner input = new Scanner(System.in);
        System.out.println(msg);
        return input.nextInt();
    }

    public static int setIntValue(String msg) {
        Scanner input = new Scanner(System.in);
        System.out.print(msg);
        return input.nextInt();
    }
    public static String setStringValue(String msg) {
        Scanner input = new Scanner(System.in);
        System.out.print(msg);
        return input.nextLine();
    }
}
