package class4;

import java.util.Scanner;

public class E8scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your salary");
        //for int type of data we sghould we using nextInt() method
        int salary=scanner.nextInt();
        if (salary>100000){
            System.out.println("You are rich");
        } else {
            System.out.println("Look for better opportunities");
        }
    }
}
