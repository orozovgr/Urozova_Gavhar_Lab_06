import java.util.Scanner;

public class Task1_CtoFConverter
{
    public static void main(String[] args)
    {
        // c to f converter


        Scanner in = new Scanner(System.in);
        double cVal = 0.0;
        double fVal = 0.0;
        boolean done = false;
        do
        {
            //Prompt
            System.out.print("Enter the value in Celcius: ");
            if(in.hasNextDouble())
        {
            cVal = in.nextDouble();
            in.nextLine();
            done = true;
        }
        else
        {
            String trash = in.nextLine();
            System.out.println("You must enter a valid double not: ");
        }
        }while (!done);

        fVal = (cVal * 1.8) + 32;
        System.out.printf("The value for %5.2f is %5.2f", cVal, fVal);
    }
}