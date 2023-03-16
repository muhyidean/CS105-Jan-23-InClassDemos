package arrays;

public class MultiDimensionalArray {

    public static void printArr(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        int [][] mArr = {
                {1,2,3},
                {4,5,6},
                {7,8,9,19}
        };

        for (int r = 0; r < mArr.length; r++) {
            printArr(mArr[r]);
            System.out.println();
        }
        /*
        r = 2  c = 0

        =======
        1   2   3
        4   5   6
        7   8   9
         */


//        for (int r = 0; r < mArr.length; r++) {
//            for (int c = 0; c < mArr[r].length; c++) {
//                System.out.print(mArr[r][c] + " ");
//            }
//            System.out.println();
//        }
    }
}
