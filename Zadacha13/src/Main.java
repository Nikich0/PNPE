import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        do
        {
            System.out.println("Write a number lower than 20: ");
            x = scanner.nextInt();
        }while(x > 20);
        if(isPrime(x)) {
            System.out.println(x + " is a prime number!");
        } else {
            System.out.println(x + " is not a prime number!");
        }

        scanner.close();
    }
    public static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        if (x <= 3) {
            return true;
        }
        if (x % 2 == 0 || x % 3 == 0) {
            return false;
        }

        return true;
    }
}