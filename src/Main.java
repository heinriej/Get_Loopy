import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        for (int c = 0; c <= 30; c++)
            System.out.print(" " + c);

        System.out.println();

        for (int c = 30; c >= 0; c--)
            System.out.print(" " + c);

        System.out.println();

        for (int c = 0; c <= 18; c+=3)
            System.out.print(" " + c);

        System.out.println();

        for (int c = 10; c >= 0; c-=2)
            System.out.print(" " + c);
    }
}