package loops;

import java.util.Scanner;

public class CountCharFromText {

    public static void main(String[] args) {
        int counter =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = input.nextLine();
        System.out.println("Please enter a character: ");
        char c = input.next().charAt(0);

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == c)
                counter++;
        }

        System.out.println(counter);
    }
}
