package Roman_no;
import java.util.Scanner;
public class Roman_no
{
	public static int romanToInt(String s)
	{
		if (s == null || s.length() == 0)
			return 0;
		int[] romanValues = new int[256];
		romanValues['I'] = 1;
		romanValues['V'] = 5;
		romanValues['X'] = 10;
		romanValues['L'] = 50;
		romanValues['C'] = 100;
		romanValues['D'] = 500;
		romanValues['M'] = 1000;
		int length = s.length();
		int total = romanValues[s.charAt(length - 1)];
		for (int i = length - 2; i >= 0; i--)
		{
			int current = romanValues[s.charAt(i)];
			int next = romanValues[s.charAt(i + 1)];
			if (current < next)
				total -= current;
			else
				total += current;
		}
		return total;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String romanNumeral = sc.nextLine();
		sc.close();
		int result = romanToInt(romanNumeral);
		System.out.println("The integer value of " + romanNumeral + " is " + result);
	}
}