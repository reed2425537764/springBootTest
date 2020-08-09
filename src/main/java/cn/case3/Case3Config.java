package cn.case3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/9 16:23
 */
@Component
public class Case3Config {

    //方法三
    @Value("${local.ip}")
    String ip;

    @Autowired
    private Environment environment;

    //方法二
    String getIP() {
        return environment.getProperty("local.ip");
    }
}
