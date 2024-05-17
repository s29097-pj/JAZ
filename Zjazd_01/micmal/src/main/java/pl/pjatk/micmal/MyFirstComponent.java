package pl.pjatk.micmal;

import org.springframework.stereotype.Component;

@Component
public class MyFirstComponent {

    // Dodanie konstruktora, który wyświetla komunikat w konsoli
    public MyFirstComponent() {
        System.out.println("Hello from MyFirstComponent");
    }
    // Dodanie metody, która wyświetla komunikat w konsoli
    public void printHelloMessage() {
        System.out.println("Hello from MyFirstComponent from method printHelloMessage");
    }

}
