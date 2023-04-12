package class5;

public class E4NestedIf {
    public static void main(String[] args) {

        String day = "Sunday";
        int money = 5000;
        if (money > 10000) {
            if (day.equals("Sunday")) {
                System.out.println("Lets go shopping");
            } else {
                System.out.println("Lets wait for sunday");
            }
        } else {
            System.out.println("Lets save more money");
        }

    }

}

