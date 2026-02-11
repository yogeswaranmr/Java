package basics;

import java.util.Scanner;

public class UserInput {
    static void main() {
        Scanner obj = new Scanner(System.in);
        String userInput = obj.nextLine();

        System.out.println("User gave: "+userInput);
    }
}
