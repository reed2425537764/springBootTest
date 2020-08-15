package cn.case4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.util.ResourceUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/9 20:52
 */
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(ResourceUtils.getFile("classpath:application-case4.yaml")));
            PropertiesPropertySource source = new PropertiesPropertySource("my", properties);
            environment.getPropertySources().addLast(source);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
