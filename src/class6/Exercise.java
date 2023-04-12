package class6;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        System.out.println("Enter user's height in inches");
        Scanner scanner = new Scanner(System.in);
        int inches = scanner.nextInt();
        if (inches < 60) {
            System.out.println("User is short");
        }
          if (inches >= 60 && inches <= 72) {
            System.out.println("User is medium");
        } else if (inches > 72) {
            System.out.println("User is tall");
        }
    }
}
