import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        int maxDigit = 0;
        for(int i = 0; i < arr1.length; i++ )
        {
            arr1[i] = scanner.nextInt();

        }
        System.out.print("Original array: ");
        for(int i = 0; i < arr1.length; i++ )
        {
            System.out.print(arr1[i] + " ");
        }
        for(int i = 0; i < arr1.length; i ++)
        {
            if(arr1[i] > maxDigit)
            {
                maxDigit = arr1[i];
            }
        }
        System.out.println(" ");
        System.out.println("Biggest number: " + maxDigit);
        scanner.close();
    }
}