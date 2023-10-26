import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 = new int[2][2];
        int sumDiag1 = 0;
        int sumDiag2 = 0;
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
        for(int i = 0; i < matrix1.length; i++ )
        {
            for(int j = 0; j < matrix1.length; j ++)
            {
                if(j == i)
                {
                    sumDiag1 += matrix1[i][j];
                }
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            sumDiag2 += matrix1[i][matrix1.length - 1 - i];
        }
        System.out.println("Main diagonal: " + sumDiag1);
        System.out.println("Second diagonal: " + sumDiag2);
        scanner.close();
    }
}