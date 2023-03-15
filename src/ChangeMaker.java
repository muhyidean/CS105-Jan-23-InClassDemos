import java.util.Scanner;

public class ChangeMaker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int q, d, n, p;
        System.out.println("Please enter amount: ");
        int amount = input.nextInt();
        int orgAmount = amount;

        // amount = 55
        q = amount / 25; // q = 2
        amount = amount % 25; // 55 % 25 = 5
        d = amount / 10; // d = 0
        amount = amount % 10; // 5 % 10 = 5
        n = amount / 5; // n = 1
        amount = amount % 5; // 5 % 5 = 0
        p = amount; // p = 0

        System.out.println("The change for " + orgAmount + " :\n" + q + (q>1?" quarters\n":" quarter\n") + d + " dimes\n" + n + " nickles\n" + p + " pennies"  );
    }
}
