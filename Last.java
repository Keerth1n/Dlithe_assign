package assignment3q1;
import java.util.Scanner;
public class Last {
	public boolean digit(int n1,int n2)
	{
		if(n1%10==n2%10)
			return true;
		else
		return false;
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		Last l=new Last();
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		System.out.println(l.digit(n1,n2));
		
	}

}
