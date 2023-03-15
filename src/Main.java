import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static final int MAXIMUM_WEIGHT_ALLOWED = 40;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 6;


        System.out.println(i);
        System.out.println(   "Enter bag weight: " );
        int bw = input.nextInt();

        if(bw <=MAXIMUM_WEIGHT_ALLOWED){
            System.out.println("No fee");
        }
        else
            System.out.println("Please pay your fee");


    }

//    System.out.println(   "Enter bag weight: " );
//    int num1 = input.nextInt();
//        System.out.println(   "Enter second number: " );
//    int num2 = input.nextInt();
//
//    int sum = num1 + num2;
//        System.out.println("The sum is: " + sum);


}