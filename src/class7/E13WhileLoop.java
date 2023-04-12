package class7;

import java.util.Scanner;

public class E13WhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int num=scanner.nextInt();
        int numb=1;
        while (numb<=num) {
            System.out.print(numb+" ");
            numb++;
        }
    }
}
