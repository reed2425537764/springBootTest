package cn.case5;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/15 12:40
 */
@SpringBootConfiguration
public class Case5Config {

    @Bean
    @Profile("dev")
    public Bean1 bean1() {
        return new Bean1();
    }

    @Bean
    @Profile("sit")
    public Bean2 bean2() {
        return new Bean2();
    }

    @Bean
    public Bean3 bean3() {
        return new Bean3();
    }
}
