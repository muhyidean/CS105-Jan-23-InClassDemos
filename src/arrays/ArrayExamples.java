package arrays;

public class ArrayExamples {

    public static void main(String[] args) {

        int [] arr1 = {1,2,3,6,7,8};
        int [] arr2 = {2,4};

        MultiDimensionalArray.printArr(addArrays(arr1,arr2));
        // ==> {3,6,7,6,5}
    }

    public static int [] addArrays(int [] a, int [] b){
        int [] ans;
        int loopTimes = 0;
        int remaining = 0;
        boolean aIsGreater = a.length>b.length;
        if(aIsGreater) {
            ans = new int[a.length];
            loopTimes = b.length;
            remaining = a.length - b.length;
        }
        else {
            ans = new int[b.length];
            loopTimes = a.length;
            remaining = b.length - a.length;
        }

        for (int i = 0; i < loopTimes; i++) {
            ans[i] = a[i] + b[i];
        }

        if(aIsGreater){
            for (int i = 0; i < remaining; i++) {
                ans[(ans.length-1)-i ] = a[(a.length-1)-i]; // 4-0=4  4-1 =3
            }
        }
        else {
            for (int i = 0; i < remaining; i++) {
                ans[(ans.length-1)-i ] = b[(b.length-1)-i];
            }
        }


        return ans;
    }
}
