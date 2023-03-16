package arrays;

public class MultiDimArray {

    public static void main(String[] args) {

        int [][] arr = { {1,2}, {4,5} , {9,8}  };

        var result = calcSumArraysSimple(arr);
        MultiDimensionalArray.printArr(result);
    }

    public static int [] calcSumArrays(int [][] mArr){
        int [] ans = new int[mArr.length];
        int sum = 0;
        for (int r = 0; r < mArr.length; r++) {
            for (int c = 0; c < mArr[r].length; c++) {
                sum+=mArr[r][c];
            }
            ans[r] = sum;
            sum = 0;
        }

        return ans;
    }

    public static int [] calcSumArraysSimple(int [][] mArr){
        int [] ans = new int[mArr.length];
        for (int r = 0; r < mArr.length; r++) {
            ans[r] = calcSum(mArr[r]);
            }
        return ans;
    }

    public static int calcSum(int [] arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
