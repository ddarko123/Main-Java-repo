package class8;

public class E11NestedLoop {
    public static void main(String[] args) {

        for (int i = 2; i < 4; i++) {
            for (int j=2; j<=10; j+=2) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //---------------------------------------------------------------------

        int i = 2;
        while (i < 4) {
            int j = 2;
            while (j <= 10) {
                System.out.print(j + " ");
                j += 2;
            }
            System.out.println();

            i++;
        }
    }
}