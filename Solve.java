package assignment3q3;
import java.util.Scanner;
public class Solve {
	public int funcn(int n1,int n2)
	{
		if(n1==n2)
			return ((n1+n2)*2);
		else
			return (n1+n2);
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		Solve s=new Solve();
		System.out.println(s.funcn(n1, n2));
		
	}

}
