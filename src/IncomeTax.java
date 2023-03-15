import java.util.Scanner;

public class IncomeTax {

    static double iTaxPayment;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isMarried;
        int salary;


        System.out.println("Are you married: \nanswer with y/n ");
        String ms = input.next();
        if(ms.equalsIgnoreCase("y"))
            isMarried = true;
        else
            isMarried = false;

        System.out.println("Please enter your salary: ");
        salary = input.nextInt();

        // Married
        if(isMarried){
            if(salary>= 70000)
                updateTaxPayment(salary,0.05);
            else if(salary>=55000)
                updateTaxPayment(salary,0.03);
            else
                updateTaxPayment(salary,0.01);
        }
        // Single
        else{
            if(salary>= 70000)
                updateTaxPayment(salary,0.085);
            else if(salary>=55000)
                updateTaxPayment(salary,0.05);
            else
                updateTaxPayment(salary,0.03);
        }


    }

    public static void updateTaxPayment(int salary, double rate ){
        iTaxPayment = salary * rate;
        System.out.println(iTaxPayment);
    }

}
