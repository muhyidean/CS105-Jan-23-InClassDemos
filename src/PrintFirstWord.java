import java.util.Scanner;

public class PrintFirstWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a sentence");
        String sentence = input.nextLine();
        int space = sentence.indexOf(" ");
        if(space == -1)
            System.out.println(sentence);
        else
            System.out.println(sentence.substring(0,space));
    }
}
