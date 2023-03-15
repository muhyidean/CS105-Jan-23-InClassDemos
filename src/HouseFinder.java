import java.util.Scanner;

public class HouseFinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rooms: ");
        int numRooms = input.nextInt();
        System.out.println("Does it have a backyard: ");
        boolean hasBackayrd = input.nextBoolean();
        System.out.println("Enter the city and state: ");
        String city = input.next();
        String state = input.next();
        System.out.println("Enter the distance to the closest market: ");
        int distanceToMarket = input.nextInt();
        System.out.println("Enter the price:");
        int price = input.nextInt();
        System.out.println("Enter the size");
        int size = input.nextInt();

        boolean meetsHouseConditions1 = (numRooms>=3 && hasBackayrd && city.equalsIgnoreCase("fairfield") && state.equalsIgnoreCase("IA") && distanceToMarket <=2 && price <=180000 && size >= 1400);
        boolean meetsHouseConditions2 = (numRooms>=3 && hasBackayrd && city.equalsIgnoreCase("fairfield") && state.equalsIgnoreCase("IA") && distanceToMarket <=8 && price <=140000 && size >= 1500);

        if(meetsHouseConditions1 || meetsHouseConditions2)
            System.out.println("Place an offer");
        else
            System.out.println("Rejected");


    }
}
