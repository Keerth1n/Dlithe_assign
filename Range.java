package assignment3q5;
import java.util.Scanner;
public class Range {
	public boolean solve(int a,int b)
	{
		if(a>=10 && a<=20 || b>=10 && b<=20)
			return true;
		else 
			return false;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Range s=new Range();
		System.out.println(s.solve(a, b));
	}

}
