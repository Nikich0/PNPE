import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for(int i = 0; i < x; i++)
        {
            for(int j = 0; j < x; j++)
            {
                if(j <= i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}