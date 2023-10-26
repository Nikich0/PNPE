import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int[] arr1 = new int[5];
       int[] arr2 = new int[5];
       for(int i = 0; i < arr1.length; i++ )
       {
           arr1[i] = scanner.nextInt();
       }
       System.out.print("Original array: ");
       for(int i = 0; i < arr1.length; i++ )
       {
           System.out.print(arr1[i] + " ");
       }
       System.out.println(" ");
       for(int i = 0; i < arr1.length; i++)
       {
           arr2[i]= arr1[arr1.length - 1 - i];
       }
       System.out.print("New array: ");
       for(int i = 0; i < arr2.length; i++ )
       {
           System.out.print(arr2[i] + " ");
       }

       scanner.close();
    }
}