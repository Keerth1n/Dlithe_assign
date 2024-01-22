package assignment3q4;
import java.util.Scanner;
public class Number {
	public boolean solve(int a,int b)
	{
		if(a==10 || b==10 || a+b==10)
			return true;
		else 
			return false;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Number s=new Number();
		System.out.println(s.solve(a, b));
	}

}
