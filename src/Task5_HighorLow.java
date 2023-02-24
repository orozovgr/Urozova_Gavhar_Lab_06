import java.util.Scanner;

public class Task5_HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        do
        {
            int max = 10;
            int min = 1;
            int random =  (int) Math.floor(Math.random() *(max - min + 1) + min);
            System.out.println(random);
            System.out.println("Please guess the random number");
            int guess = in.nextInt();
            if (guess > random)
            {
                System.out.println("High");
            }
            else if(guess == random)
            {
                System.out.println("on the money");
            }
            else
            {
                System.out.println("Low");
            }

            done = true;
        }while(!done);
    }
}
