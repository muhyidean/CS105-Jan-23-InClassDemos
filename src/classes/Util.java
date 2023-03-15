package classes;

public class Util {

    public static int sum(int a, int b){
        int r = a + b;
        return r;
    }

    public static void greetSomeone(String name){
        System.out.println("Hello " + name);

    }



    public static void main(String[] args) {

        String s = "dean";

        int y = sum(2,2);
        greetSomeone("Eden");

        String result = getInitials("muhyieddin", "tarawneh").toUpperCase();
        System.out.println(result);



    }

    public static String getInitials(String firstName, String lastName){
        return firstName.charAt(0)+"."+lastName.charAt(0);
    }


}
