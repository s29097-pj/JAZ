package pl.pjatk.micmal;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyThirdComponent {

    public MyThirdComponent(ApplicationContext applicationContext) {
        System.out.println("Hello from MyThirdComponent");

        // Utworzenie obiektów komponentów za pomocą metody .getBean()
        MyFirstComponent myFirstComponent = applicationContext.getBean("myFirstComponent", MyFirstComponent.class);
        MySecondComponent mySecondComponent = applicationContext.getBean("mySecondComponent", MySecondComponent.class);

        // Wywołanie metody z klasy MyFirstComponent
        myFirstComponent.printHelloMessage();

        // Wywołanie metody z klasy MySecondComponent
        mySecondComponent.printHelloMessage();

    }
}