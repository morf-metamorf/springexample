package srcOne.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import srcOne.auth.Auth;

@Component
public class UIController {
    @Autowired
    private Auth auth;

    public void processRequest() {
        boolean var1 = auth.check("Test", null);
        if (var1) {
            System.out.println("Success");
        }
    }
}
