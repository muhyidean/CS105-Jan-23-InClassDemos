package loops;

public class RemoveDuplicatedWITHBuiltInContains {

    public static boolean hasChar(String text, char c){
        for (int j = 0; j < text.length(); j++) {
            if(text.charAt(j) == c ) {
                return true;
            }

        }
        return false;
    }

    public static String removeDuplicates(String text){
        String ans = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // to find if the ans contains the text
            if(!hasChar(text,c))
                ans = ans + c;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println( removeDuplicates("7777797779333448555"));
        }

    }


