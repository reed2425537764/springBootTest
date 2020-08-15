package cn.case5;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Profile;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/15 12:58
 */
@SpringBootConfiguration
@Profile("dev")
@ConfigurationProperties("local")
@EnableConfigurationProperties
public class Case5Properties {
    private String ip;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
