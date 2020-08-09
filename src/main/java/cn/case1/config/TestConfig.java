package cn.case1.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@SuppressWarnings("ConfigurationProperties")
@ConfigurationProperties
@Component
public class TestConfig {
    private List<String> city;

    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }
}
