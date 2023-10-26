import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x > 0 )
        {
            System.out.println(x + " is Positive!");
        }
        else
        {
            System.out.println(x + " is Negative!");
        }

        scanner.close();
    }
}