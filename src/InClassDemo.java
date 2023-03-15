public class InClassDemo {

    public static void main(String[] args) {

        String city = "fairifield";
        int rooms = 3;
        boolean meetHouseConditions = rooms>=3 && city.equals("fairfield");
        if ( meetHouseConditions ){
            System.out.println("Place an offer");
        }
        else
            System.out.println("reject the house");
    }
}
