package loops;

public class RemoveDuplicatedWITHOUTContains {

    public static void main(String[] args) {

        String nums = "7777797779333448555";
        String ans =""; // 793485
        char c;
        boolean hasChar = false;

        // traverse through the nums string
        for (int i = 0; i < nums.length(); i++) {
            c = nums.charAt(i);
            // to find if the ans contains the text
            for (int j = 0; j < ans.length(); j++) {
                if(ans.charAt(j) == c ){
                    hasChar=true;
                    break;
                }
            }
            if(!hasChar)
                ans = ans + c;
            hasChar = false;
        }

        System.out.println(ans);



    }
}
