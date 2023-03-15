import java.util.Scanner;

public class SliceString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter sentence: ");
        String sen = input.nextLine();
        // "I am going to school today"
        System.out.println("Enter word you want to slice out: ");
        String word = input.next();
        // "school"

        // step 1
        int firstIndex = sen.indexOf(word);
        // step 2 & 3
        int endIndex = firstIndex + word.length();
        // step 4
        String firstPart = sen.substring(0,firstIndex);
        // step 5
        String secondPart = sen.substring(endIndex+1);
        String answer = firstPart + secondPart;
        System.out.println(answer);
        /*
        1- Find the first index of the word
        2- Find the length of the word
        3- Find the end index of the word
        3- Slice out the first part (before the word)
        4- Slice out the second part (after the word)
        5- concatenate both parts from step 2 and 3
         */


    }
}
