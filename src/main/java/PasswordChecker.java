import java.util.Scanner;
public class PasswordChecker
{

    public static boolean password_is_valid(String password)
    {
        boolean check = true;
        try
        {
        if (password.length()<8)
        {
            System.out.println("password length should be at least 8 characters long.");
            check=false;
        }

        if (password.isEmpty())
        {
            System.out.println("password cannot be empty.");
            check=false;
        }

        if (!password.matches("(.*[a-z].*)"))
        {
            System.out.println("password should contain lowercase.");
            check=false;
        }
        if (!password.matches("(.*[A-Z].*)"))
        {
            System.out.println("password should contain uppercase.");
            check=false;
        }

        if (!password.matches("(.*[@#$%!].*)"))
        {
            System.out.println("password should have at least one special case.");
            check=false;
        }
        if (!password.matches("(.*[0-9].*)"))
        {
            System.out.println("password should have at least one digit.");
            check=false;
        }

        }
        catch (Exception e)
        {
            System.out.println("make sure the above conditions are met.");
        }
        return check;
    }
    public static boolean passwordIsOk(String password)
    {
        if (password.length() < 8 || !password.matches("(.*[a-z].*)") || password.isEmpty())
        {
            System.out.println("password should meet at least 3 of the conditions.");
            return false;
        }
        if (!password.matches("(.*[A-Z].*)")|| !password.matches("(.*[@#$%!].*)") || !password.matches("(.*[0-9].*)"))
        {
            System.out.println("password should meet at least 3 of the conditions.");
            return false;
        }
        return true;
    }
    public static boolean passwordIsNeverOk(String password)
    {
        if (password.length() < 8)
        {
            if (password.isEmpty())
            {
                return false;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                        "2. A password consists of only letters and digits.\n" +
                        "3. A password must contain at least one digits \n" +
                        "Input a password: \n");
        String s = input.nextLine();

        if (password_is_valid(s))
        {
            System.out.println("Password is valid: " + s);
        }
        else
        {
            System.out.println("Not a valid password: " + s);
        }
        if (passwordIsOk(s))
        {
            System.out.println("Password is ok");
        }
        else
        {
            System.out.println("Password is not okay.");
        }
        if (passwordIsNeverOk(s))
        {
            System.out.println("Password is ok");
        }
        else
        {
            System.out.println("Password is not okay.");
        }

    }
}


