import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x > 10)
        {
            System.out.println(x + " is bigger than 10!");
        }
        else
        {
            System.out.println(x + " is lower than 10!");
        }

        scanner.close();
    }
}