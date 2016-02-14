import org.junit.Assert;
import org.junit.Test;
import srcOne.auth.AuthImplementation;

/**
 * Created by AMitrokhin on 11.02.2016.
 */
public class TestAuth {
    @Test
    public void testAuth() {
        AuthImplementation authImp = new AuthImplementation();
        boolean authenticated = authImp.check("Test1", null);
        Assert.assertTrue("User not authenticated", authenticated);

        authenticated = authImp.check("InvalidUser", null);
        Assert.assertFalse("User shouldn't be authenticated", authenticated);
    }
}
