package app;

import app.controller.Controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){

        ApplicationContext appContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        Controller controller = appContext.getBean("controller", Controller.class);

        controller.go();
    }
}
