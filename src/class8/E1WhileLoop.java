package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
        System.out.println("Enter starting number");
        int start= scanner.nextInt();
        System.out.println("Enter ending number");
        int end= scanner.nextInt();
        System.out.println("Enter step number");
        int step= scanner.nextInt();
        while (start<=end) {
            System.out.print(start+" ");
            start+=step;
        }





    }
}
