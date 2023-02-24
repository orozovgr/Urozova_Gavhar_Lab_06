import java.util.Scanner;

public class Task2_FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double milePerGal = 0.0;
        double tankSize = 0.0;
        double pricePerGal = 0.0;

        double priceFor100 = 0.0;
        double howFarFullTank = 0.0;


        boolean done = false;
        String trash = "";

        // Input all the value swe need
        do
        {
            System.out.print("Enter the miles per gallon: ");
            if(in.hasNextDouble())
            {
                milePerGal = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must eneter a valid for MPG not: " + trash);
            }
        }while(!done);

        do
        {
            System.out.print("Enter the tank size: ");
            if(in.hasNextDouble())
            {
                tankSize = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must eneter a valid number for tank size not: " + trash);
            }
        }while(!done);

        do
        {
            System.out.print("Enter the price per gallon: ");
            if(in.hasNextDouble())
            {
                pricePerGal = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid number for the price per gallon not: " + trash);
            }
        }while(!done);

        priceFor100 = 100.0 / milePerGal * pricePerGal;
        howFarFullTank = tankSize * milePerGal;

        System.out.println("The car can go 100 miles for " + priceFor100 + " dollars ");
        System.out.println("And it can go " + howFarFullTank + " miles on a full tank.");


    }

}
