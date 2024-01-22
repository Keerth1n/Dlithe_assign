/*Given 3 integer values, a b c, return their sum.
 *However, if any of the values is a teen in the range 13..19 inclusive, then that value counts as 0, except 15 and 16 do not count as a teens.
 *Write a separate helper "public int fixTeen(int n) {"that takes in an integer value and returns that value fixed for the teen rule}.
 *In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
 *Define the helper below and at the same indent level as the main noTeenSum().
 *noTeenSum(1, 2, 3) → 6
 *noTeenSum(2, 13, 1) → 3
 *noTeenSum(2, 1, 14) → 3*/
package noteensum;
import java.util.Scanner;
public class noteensum
{
	static int a,b,c;
	static Scanner sc=new Scanner(System.in);
	public static int noTeenSum()
	{
		return fixTeen(a)+fixTeen(b)+fixTeen(c);
	}
	public static int fixTeen(int n)
	{
		if((n>=13&&n<=19)&&!(n==15||n==16))
			return 0;
		return n;
	}
	public static void main(String[] args)
	{
		System.out.print("Enter 3 numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println(noTeenSum());
	}
}