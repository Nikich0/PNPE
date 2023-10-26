import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[3];
        for(int i=0; i< arr1.length; i++)
        {
            arr1[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int i=0; i< arr1.length; i++)
        {
            if(arr1[i] % 2 != 0)
            {
                sum += arr1[i];
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}