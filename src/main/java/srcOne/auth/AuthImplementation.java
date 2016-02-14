package srcOne.auth;

import org.springframework.stereotype.Component;

@Component
public class AuthImplementation implements Auth {
    public boolean check(String eMail, String pasWord) {
        if (eMail.equals("Test")) {
            return true;
        }
        return false;
    }
}
