package IPv4_Address;
public class IPv4_Address
{
	public static int isValid(String s)
	{
        String[] parts = s.split("\\.");
        if (parts.length != 4)
            return 0;
        for (String part : parts)
        {
            if (part.isEmpty() || part.length() > 3)
                return 0;
            for (char c : part.toCharArray())
                if (!Character.isDigit(c))
                    return 0;
            int num = Integer.parseInt(part);
            if (num < 0 || num > 255)
                return 0;
            if (part.length() > 1 && part.charAt(0) == '0')
                return 0;
        }
        return 1;
    }
    public static void main(String[] args)
    {
        String address1 = "222.111.111.111";
        String address2 = "5555..555";
        System.out.println("Is " + address1 + " a valid IPv4 address? " + isValid(address1));
        System.out.println("Is " + address2 + " a valid IPv4 address? " + isValid(address2));
    }
}