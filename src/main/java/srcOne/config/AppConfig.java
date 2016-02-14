package srcOne.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import srcOne.auth.Auth;
import srcOne.auth.AuthImplementation;
import srcOne.service.UIController;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public Auth getAuth(){
        return new AuthImplementation();
    }

    @Bean
    public UIController getUIController(){
        return new UIController();
    }
}
