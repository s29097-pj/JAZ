package pl.pjatk.micmal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyFourthComponent {

    // Dodanie konstruktora, który wyświetla wartość zmiennej z pliku application.properties
    public MyFourthComponent(@Value(("${my.custom.property}")) String myCustomProperty) {
        System.out.println(myCustomProperty);
    }

}