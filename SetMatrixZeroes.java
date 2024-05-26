package SetMatrixZeroes;
import java.util.Scanner;
public class SetMatrixZeroes
{
	public static void setZeroes(int[][] matrix)
	{
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;
        for (int j = 0; j < n; j++)
            if (matrix[0][j] == 0)
            {
                firstRowZero = true;
                break;
            }
        for (int i = 0; i < m; i++)
            if (matrix[i][0] == 0)
            {
                firstColZero = true;
                break;
            }
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (matrix[i][j] == 0)
                {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
        if (firstRowZero)
            for (int j = 0; j < n; j++)
                matrix[0][j] = 0;
        if (firstColZero)
            for (int i = 0; i < m; i++)
                matrix[i][0] = 0;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int m = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int n = sc.nextInt();
		int[][] matrix = new int[m][n];
		System.out.println("Enter the matrix elements row by row:");
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				matrix[i][j] = sc.nextInt();
		sc.close();
		setZeroes(matrix);
		System.out.println("The modified matrix is:");
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}