package pl.pjatk.micmalo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataConfiguration {

    @Bean
    public MySecondComponent mySecondComponent() {
        return new MySecondComponent();
    }

    @Bean
    public List<String> defaultData(@Value("${spring.application.name:jakakolwiekwartosc}") String appName) {
        System.out.println(appName);
        return List.of("1", "2", "3", "4", "5" );
    }

}
