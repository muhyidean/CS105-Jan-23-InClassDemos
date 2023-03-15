package loops;

public class RemovingDuplicatedAdjacentValues {

    // 6797779333448555 ==> 679793485

    public static void main(String[] args) {
      String nums = "7777797779333448555";
      String ans = "";  // 797
      ans = ans + nums.charAt(0); //

        for (int i = 1; i < nums.length(); i++) {
            if(nums.charAt(i) != ans.charAt( ans.length()-1) )
                ans = ans + nums.charAt(i);
        }

        System.out.println(ans);

    }
}
