package class2;

public class Variables {
    public static void main(String[] args) {

        String name="Darko";
        String lastName="Kochovski";
        String grade="7th grade";
        String city="Fort Lauderdale";
        String state="Florida";
        String phoneNumber="+1123-1234-123";
        System.out.println("My name is "+name+" and my last name is "+lastName);
        System.out.println("I am "+grade+" student");
        System.out.println("I live in "+city+", "+state);
        System.out.println("And my phone number is "+phoneNumber);

        grade="8th grade";
        city="Houston";
        state="Texas";
        phoneNumber="+1432-4321-321";

        System.out.println("My name is "+name+" "+lastName+" and I moved to "+city+", "+state+". My phone number is "+phoneNumber+". I am "+grade);


    }
}
