package srcOne;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import srcOne.config.AppConfig;
import srcOne.service.UIController;

/**
 * Created by AMitrokhin on 11.02.2016.
 */
public class Runner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UIController ui = context.getBean(UIController.class);
        ui.processRequest();
    }

}
