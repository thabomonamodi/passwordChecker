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
                System.out.println("password length should be 8 characters long.");
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
            if(!password.matches("(.*[0-9].*)"))
            {
                System.out.println("password should have at least one digit.");
                check=false;
            }
        }
        catch (Exception e)
        {
            System.out.println("make sure the above conditions are met."+e.getMessage());
        }
        return check;
    }
    public static boolean passwordIsOk(String password)throws Exception
    {
        //noinspection SingleStatementInBlock
        if ((password.length() < 8) || !password.matches("(.*[a-z].*)"))
        {
            throw new Exception("Password should meet at least 3 of the conditions.\n"+
                    "1. Password length should be 8 characters long.\n"+
                    "2. Password cannot be empty.\n"+
                    "3. Password should contain lowercase.");
            //System.out.println();
            //return false;
        }
        if (!password.matches("(.*[A-Z].*)")|| !password.matches("(.*[@#$%!].*)") || !password.matches("(.*[0-9].*)"))
        {
            throw new Exception("Password should meet at least 3 of the conditions:\n"+
                    "1. Password should contain uppercase.\n"+
                    "2. Password should have at least one special case.\n"+
                    "3. Password should have at least one digit.");
        }
        return true;
    }
    public static boolean passwordIsNeverOk(String password) throws Exception
    {
        if (password.length() < 8)
        {
            if (password.isEmpty())
            {
                throw new Exception("Password cannot be empty!");
            }
            throw new Exception("Password must be 8 characters long!");
        }

        return true;
    }

    public static void main(String[] args)throws Exception
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
            System.out.println(s + ": Password is valid!");
        }
        else
        {
            System.out.println(s + ": Not a valid password!");
        }
        if (passwordIsOk(s))
        {
            System.out.println("Password is ok");
        }
        else
        {
            System.out.println("Password is not okay.");
        }
        password_is_valid(s);
        passwordIsNeverOk(s);
    }
}


