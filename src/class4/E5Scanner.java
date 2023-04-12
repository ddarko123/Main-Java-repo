package class4;


import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {
        /* scanner is a class (which know how to take input from keyboard)
        scan is avariable of type scanner just like we create a variable of type String
        new is special keyword which create the object of a class
        Scanner again with ()
        System.in which means we want to use the scanner class for taking the user input
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Please Enter your name");
        //calling the next method to take a string from the user
        String name=scan.next();
        System.out.println("You are amazing "+name);


    }
}
