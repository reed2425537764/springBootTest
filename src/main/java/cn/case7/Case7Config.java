package cn.case7;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/16 10:40
 */
@SpringBootConfiguration
@PropertySource("classpath:application-case5.properties")
@ConfigurationProperties("cat")
public class Case7Config {
    private String enable;


    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }
}
