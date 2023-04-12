package class7;

public class E10WhileLoop {
    public static void main(String[] args) {

        //1 2 4 5 7 8 10 11 13
        int num=1;
        while(num<=20){
            if (num%3!=0) {
                System.out.print(num+" ");
            }
            num++;

        }
    }
}
