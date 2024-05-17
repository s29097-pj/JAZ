package pl.pjatk.micmal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public EmployeePojo employeePojo() {
        return new EmployeePojo("John Doe", "Developer", 30);
    }

    @Bean
    public List<String> defaultData() {
        return Arrays.asList("String1", "String2", "String3", "String4", "String5");
    }
}