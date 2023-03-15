import java.util.Scanner;

public class BaggageWeightSystem {
static final int MAX_WEIGHT = 50;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fee = 0;
        int roundedUpWeight = 0;
        int extraWeight =0;
        System.out.println("Enter weight of the bag: ");
        double bagWeight = input.nextDouble();

        if(bagWeight <= MAX_WEIGHT){
            System.out.println("The fee is: " + fee);
        }
        else {
            roundedUpWeight =  (int) Math.ceil(bagWeight);
            extraWeight = roundedUpWeight - MAX_WEIGHT;
            if(extraWeight<=5){
                fee = 10;
                System.out.println("The fee is: " + fee);
            }
            else{
                fee = ( 10 + ((roundedUpWeight - (MAX_WEIGHT + 5)) * 5) );
                System.out.println("The fee is: " + fee);

            }

        }

    }
}
