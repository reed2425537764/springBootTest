package cn.case4;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/15 11:10
 */
@SpringBootConfiguration
@ConfigurationProperties
@EnableConfigurationProperties //没有此注解 属性不会被注入
public class Case4Config {

//    @Value("${case4Port}")    属性立马注入
    private String case4Port;

    public String getCase4Port() {
        return case4Port;
    }

    public void setCase4Port(String port) {
        this.case4Port = port;
    }
}
