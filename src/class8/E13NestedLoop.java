package class8;

import java.sql.SQLOutput;

public class E13NestedLoop {
    public static void main(String[] args) {

        for (int j = 0; j < 3; j++) {
            for (int i = 1; i < 5; i++) {
                System.out.print(i + j+" ");

            }
            System.out.println();


        }
    }
}