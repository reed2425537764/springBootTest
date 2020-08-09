package cn.case3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/9 17:18
 */
//指定(额外)配置文件
@Configuration
//Spring暂未提供加载指定位置yml文件的注解
@PropertySource("classpath:application-case3_1.properties")
public class MyConfig {
    @Value("${city}")//不用set方法
    List<String> city;

    @Value("${case3.phone}")
    String phone;
}
