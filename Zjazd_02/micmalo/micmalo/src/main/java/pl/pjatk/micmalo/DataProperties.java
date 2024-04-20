package pl.pjatk.micmalo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "login-service")
public class DataProperties {

    private String loginUrl;
    private String user;
    private String password;

    public DataProperties(){}

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
