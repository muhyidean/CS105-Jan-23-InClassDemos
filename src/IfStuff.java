public class IfStuff {

    public static void main(String[] args) {
        int score = 155;

        if( (0 < score) && (score <= 100) ) // T (0 < score) && (score <= 100)
        {
            System.out.println("Valid score");
        }
        else
        {
            System.out.println("Invalid score");
        }
    }
}
