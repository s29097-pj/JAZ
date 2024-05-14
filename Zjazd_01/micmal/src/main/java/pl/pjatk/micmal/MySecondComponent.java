package pl.pjatk.micmal;

import org.springframework.stereotype.Component;

@Component
public class MySecondComponent {

    // Dodanie konstruktora, który wyświetla komunikat w konsoli
    public MySecondComponent(MyFirstComponent myFirstComponent) {
        System.out.println("Hello from MySecondComponent");
        myFirstComponent.printHelloMessage();
    }

    // Dodanie metody, która wyświetla komunikat w konsoli
    public void printHelloMessage() {
        System.out.println("Hello from MySecondComponent!");
    }

}
