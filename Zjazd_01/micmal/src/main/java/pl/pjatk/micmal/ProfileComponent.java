package pl.pjatk.micmal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProfileComponent {

    @Value("${my.custom.variable:false}")
    private boolean myCustomVariable;

    public ProfileComponent() {
        if(myCustomVariable) {
            System.out.println("Profile bean has been created.");
        } else {
            System.out.println("Profile bean has not been created.");
        }
    }
}