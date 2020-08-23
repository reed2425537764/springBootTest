package cn.case8;

import cn.case1.Cat;
import cn.case1.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/22 20:52
 */
@EnableAutoConfiguration/*(exclude = {User.class})*/
/*
* @EnableAutoConfiguration作用：从classpath中搜索所有META-INF/spring.factories配置文件
* 然后把所有org.springframework.boot.autoconfigure.EnableAutoConfiguration对应的配置项加载到spring容器
*
* 内部实现关键点
* 1. ImportSelector 该接口方法返回的数组中的内容会被纳入spring容器管理
* 2. SpringFactoriesLoader搜索所有META-INF/spring.factories配置文件并读取
* */
//@Import({cn.case1.Case1Config.class, cn.case1.Cat.class}) 方法一
public class BootApplication8 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BootApplication8.class);
        System.out.println(context.getBean(User.class));
        System.out.println(context.getBean(Cat.class));

        context.close();
    }
}
