package loops;

public class BreakCont {

    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {

            if (i >=5 && i<=7) {
                i++;
                continue;
            }

            System.out.println(i);
            i++;
        }

//        for (int i = 0; i < 10; i++) {
//
//            if(i ==5){
//                System.out.println("skip...");
//                continue;
//            }
//            System.out.println(i);
//        }
//        System.out.println("Something ...");
//    }
    }
}
