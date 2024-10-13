import java.util.Random;
import java.util.Scanner;

public class Die_Roller
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();

        int die1 = -1;
        int die2 = 0;
        int die3 = 0;
        int dieRoll = 0;
        int dieSum = 0;
        boolean gameDone = false;
        boolean conContinue = false;
        String nextGame = "";
        String trash = "";

        System.out.printf("%-10s %-10s %-10s %-10s %-10s %n", "Roll", "Die 1", "Die 2", "Die 3", "Sum");
        System.out.println("-----------------------------------------------------");

        do
        {
            do
            {

                die1 = gen.nextInt(6) + 1; // 0 - 5 + 1 is 1 - 6
                die2 = gen.nextInt(6) + 1;
                die3 = gen.nextInt(6) + 1;

                dieRoll++;
                dieSum = die1 + die2 + die3;

                System.out.printf("%-10d %-10d %-10d %-10d %-10d %n", dieRoll, die1, die2, die3, dieSum);

            }while (!(die1 == die2 && die2 == die3));

            do
            {
                System.out.println();
                System.out.print("You got a triple! Want to play again [Y/N]? ");
                nextGame = in.nextLine();

                if (nextGame.equalsIgnoreCase("Y"))
                {
                    conContinue = true;
                }
                else if (nextGame.equalsIgnoreCase("N"))
                {
                    gameDone = true;
                    conContinue = true;
                }
                else
                {
                    conContinue = false;
                    System.out.println("You entered an invalid input, please try again!");
                }
            } while (!conContinue);
        } while(!gameDone);


    }
}
