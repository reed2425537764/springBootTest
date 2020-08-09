package cn.case3;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/9 18:09
 */
@Configuration
@PropertySource("classpath:application-case3_2.properties")
@ConfigurationProperties(prefix = "spring.datasource") //需要set方法和EnableConfigurationProperties
@EnableConfigurationProperties
public class DatasourceConfig {
    String driverClassName;
    String username;
    String password;
    String url;

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
