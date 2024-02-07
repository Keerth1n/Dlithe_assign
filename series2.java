package series2;
import java.util.Scanner;
public class series2
{
	static int a,b,n;
	public static void printseries()
	{
		for(int i=0;i<n;i++)
		{
            int term=a;
            for(int j=0;j<=i;j++)
                term+=Math.pow(2,j)*b;
            System.out.print(term + " ");
        }
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a,b,n: ");
		a=sc.nextInt();
		b=sc.nextInt();
		n=sc.nextInt();
		printseries();
		sc.close();
	}
}