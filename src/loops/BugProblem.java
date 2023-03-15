package loops;

import java.util.Scanner;

public class BugProblem {

    public static final double GROWTH_RATE = 0.95;
    public static final double ONE_BUG_VOLUME = 0.002;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the volume of the house: "); // house volume = 5000
        double houseVolume = input.nextDouble();

        System.out.println("Enter the estimated number of roaches: "); // 10
        int startPopulation = input.nextInt();

        double newBugs =0;
        int countWeeks = 0;

        double population = startPopulation; // 10
        double totalBugVolume = population * ONE_BUG_VOLUME; // 0.02

        while (totalBugVolume <= houseVolume){

            newBugs = population * GROWTH_RATE; // 9.5
            population = population + newBugs; // 10 + 9.5 = 19.5
            totalBugVolume = totalBugVolume + (newBugs * ONE_BUG_VOLUME);
            countWeeks++;

        }

        System.out.println("number of weeks: " + countWeeks);
        System.out.println("number of bugs: " + population);
        System.out.println("volume of the bugs:" + totalBugVolume);



    }
}
