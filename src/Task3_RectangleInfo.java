import java.util.Scanner;

public class Task3_RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the width");
        double width = in.nextDouble();
        System.out.println("Enter the height");
        double height = in.nextDouble();
        double area = width * height;
        System.out.print("the area of the rectangle is : ");
        System.out.println(area);

        double perimeter = 2*(width+height);
        System.out.print(" the perimeter of the rectangle is : ");
        System.out.println(perimeter);


        double length = Math.sqrt(width * width + height * height);
        System.out.println("the length of the rectangle is : ");
        System.out.println(length);








    }
}
