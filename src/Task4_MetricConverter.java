import java.util.Scanner;

public class Task4_MetricConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of the measurement");
        Double meters = in.nextDouble();
        Double miles = meters * 0.00062137 ;
        System.out.print("the miles is: ");
        System.out.println(miles);

        Double feet = meters * 3.28084 ;
        System.out.print("the feet is: ");
        System.out.println(feet);

        Double inch = meters * 39.3701 ;
        System.out.print("the inch is: ");
        System.out.println(inch);




    }
}
