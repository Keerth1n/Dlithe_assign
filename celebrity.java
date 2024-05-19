package celebrity;
import java.util.Scanner;
public class celebrity
{
	static boolean knows(int[][] M, int a, int b)
	{
        return M[a][b] == 1;
    }
    static int findCelebrity(int[][] M, int N)
    {
        int candidate = 0;
        for (int i = 1; i < N; i++)
            if (knows(M, candidate, i))
                candidate = i;
        for (int i = 0; i < N; i++)
            if (i != candidate && (knows(M, candidate, i) || !knows(M, i, candidate)))
                return -1;
        return candidate;
    }
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
        int M[][], N;
        System.out.print("Enter square matrix size: ");
        N=sc.nextInt();
        M=new int[N][N];
        System.out.println("Enter square matrix elements:");
        for (int i = 0; i < N; i++)
        	for (int j = 0; j < N; j++)
        		M[i][j]=sc.nextInt();
        System.out.println("Celebrity at index: " + findCelebrity(M, N));
        sc.close();
    }
}