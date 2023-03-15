import java.util.Scanner;

public class CalculateCircleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius: ");
        double radius = input.nextDouble();
        double area = Math.PI * (radius*radius);
        System.out.println("The area is: " + area);
    }
}
