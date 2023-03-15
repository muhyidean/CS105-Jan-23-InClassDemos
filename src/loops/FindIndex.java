package loops;

import java.util.Scanner;

public class FindIndex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = input.next();
        System.out.println("Enter character to search: ");
        char ch = input.next().charAt(0);

        int index = 0;
        int wordLength = name.length();

        while(index < wordLength){

            if(name.charAt(index) == ch){
                System.out.println(index);

            }
            index++;

        }
    }
}
