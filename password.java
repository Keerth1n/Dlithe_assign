/*password checker: Give a string (password) And check if it is a valid password as per given following rules if yes print 1 else print 0.
 *Rules:
 *1. Password should  be a minimum of 8 characters in length.
 *2. Password should contain at least one upper case , one lower case , one special character and one digit .
 *3. It should not contain white space.*/
package password;
import java.util.Scanner;
import java.util.regex.*;
public class password
{
	static String pass_word;
	static Scanner sc=new Scanner(System.in);
	public static boolean isValidPassword()
	{
		if(pass_word.length()<8)
			return false;
		String regex="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).+$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(pass_word);
		if(!matcher.matches())
			return false;
		if(pass_word.contains(" "))
			return false;
		return true;
	}
	public static void main(String[] args)
	{
		System.out.print("Enter password: ");
		pass_word=sc.nextLine();
		if (isValidPassword())
			System.out.println("1");
		else
			System.out.println("0");
	}
}