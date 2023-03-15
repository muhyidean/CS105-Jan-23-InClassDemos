package loops;

public class FindNWords {

    public static void main(String[] args) {
        String sentence = "I am goign to school";

        int numWords = 1;
        int index = 0;

        sentence = sentence.trim();
        while(index < sentence.length()){
            if( sentence.charAt(index) == ' ')
                numWords++;
            index++;
        }

        if(sentence.equals("")){
            numWords = 0;
            System.out.println("number of words: " + numWords);
        }
        else
            System.out.println("number of words: " +  numWords);

    }
}
