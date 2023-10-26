import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 = new int[2][2];
        int sumSecondRow = 0;
        for(int i = 0; i < matrix1.length; i++ )
        {
            for(int j = 0; j < matrix1.length; j ++)
            {
                matrix1[i][j]= scanner.nextInt();
            }
        }
        System.out.print("Matrix: ");
        System.out.println();
        for(int i = 0; i < matrix1.length; i++ )
        {
            for(int j = 0; j < matrix1.length; j ++)
            {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 1; i < 2; i++)
        {
            for(int j = 0; j < matrix1.length; j ++)
            {
                sumSecondRow += matrix1[i][j];
            }
        }

        System.out.println("Sum of first row: " + sumSecondRow);
        scanner.close();
    }
}