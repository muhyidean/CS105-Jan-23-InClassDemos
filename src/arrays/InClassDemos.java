package arrays;

public class InClassDemos {

    public static void main(String[] args) {

        int [] someArr = {1,2,3};
        printAvg(someArr);


//        int [] someArr = wrapInArr(x,y,z); // [1,2,3]

//        System.out.println( findIndex(someArr,8) );
    }


    public static int [] wrapInArr(int a, int b, int c){
        int [] arr = new int[3];

        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        return arr;
    }

    public static int calcSum(int [] arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    public static boolean hasItem(int [] arr, int item){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==item)
                return true;
        }
        return false;
    }

    public static int findIndex(int [] arr, int item){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==item)
                return i;
        }
        return -1;
    }

    public static void printAvg(int [] arr){
        int sum = calcSum(arr);
        double avg = sum / arr.length;
        System.out.println(avg);
    }
}
