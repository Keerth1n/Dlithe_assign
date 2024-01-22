package assignment3q2;
import java.util.Scanner;


public class Even {

	public boolean digit(int n1)
	{
		if(n1%2==0)
			return true;
		else
		return false;
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		Even l=new Even();
		int n1=scan.nextInt();
		
		System.out.println(l.digit(n1));
		
	}

}


