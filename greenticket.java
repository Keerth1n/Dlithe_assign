/*You have a green lottery ticket, with integers a, b, and c on it.
 *If the numbers are all different from each other, the result is 0.
 *If all of the numbers are the same, the result is 20.
 *If two of the numbers are the same, the result is 10.
 *greenTicket(1, 2, 3) → 0
 *greenTicket(2, 2, 2) → 20
 *greenTicket(1, 1, 2) → 10*/
package greenticket;
import java.util.Scanner;
public class greenticket
{
	static int a,b,c;
	static Scanner sc=new Scanner(System.in);
	public static int greenTicket()
	{
		if(a==b&&b==c)
			return 20;
		else if(a==b||b==c||a==c)
			return 10;
		else
			return 0;
	}
	public static void main(String[] args)
	{
		System.out.print("Enter 3 numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println(greenTicket());
	}
}
