import java.util.Scanner;

public class PrintInitials {

    /*

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter full name: ");
        String fullName = input.nextLine();
        // dean altarawneh
        int space = fullName.indexOf(" ");
        String ans = fullName.charAt(0) + "." + fullName.charAt(space+1);
        System.out.println(ans.toUpperCase());
        // D.A
    }
}
