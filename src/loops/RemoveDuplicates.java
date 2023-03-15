package loops;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String nums = "7777797779333448555";
        String ans =""; // 793485
        String c = "";

        for (int i = 0; i < nums.length(); i++) {
             c = String.valueOf(nums.charAt(i));
            if( !(ans.contains(c))) // !(ans contain '7')
                ans = ans + c;
        }

        System.out.println(ans);



    }
}
