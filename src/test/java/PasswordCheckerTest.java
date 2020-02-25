import org.junit.Assert;
import org.junit.Test;

public class PasswordCheckerTest
{
    @Test
    public void testPassword_is_valid()
    {
        Assert.assertEquals(PasswordChecker.password_is_valid("(.*[a-z].*)"),false);
        Assert.assertEquals(PasswordChecker.password_is_valid("(.*[A-Z].*)"),false);
        Assert.assertEquals(PasswordChecker.password_is_valid("(.*[0-9].*)"),false);
        Assert.assertEquals(PasswordChecker.password_is_valid("(.*[@#$%!].*)"),false);
        //Assert.assertEquals(PasswordChecker.password_is_valid());
    }
}
