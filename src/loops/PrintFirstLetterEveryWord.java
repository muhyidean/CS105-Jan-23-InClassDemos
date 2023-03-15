package loops;

import java.util.Scanner;

public class PrintFirstLetterEveryWord {

    // Write a program that will ask the user to enter sentence,
    // and print the first letter of each word

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = input.nextLine();
        String s = "";

        for (int i = 0; i < sentence.length(); i++) {

            if(i == 0){
//                System.out.println(sentence.charAt(i));
                s = s + sentence.charAt(i);
            }

            if(sentence.charAt(i) == ' '){
//                System.out.println(sentence.charAt(i+1));
                s = s + sentence.charAt(i+1);
            }
        }

        System.out.println(s);


    }
}
