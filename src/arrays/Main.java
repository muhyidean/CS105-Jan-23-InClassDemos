package arrays;

public class Main {

    public static void main(String[] args) {

        int [] nums = {10,4,6,1,8}; // nums, arr ->> [10,4,6,1,8]
        int [] arr = nums;

        int [] ans = resetFirstValue(nums);

        int x = 5;
        int y = x;


        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " " + ans[i]);

        }
    }

    public static int [] resetFirstValue(int [] arr){
        int [] newArr = new int[arr.length]; // [0,0,0,0,0]

        for (int i = 1; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
