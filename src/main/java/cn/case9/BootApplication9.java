package cn.case9;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/23 10:46
 */
@ComponentScan
public class BootApplication9 {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BootApplication9.class);
        //添加监听器到spring容器中 方法一
//        app.addListeners(new MyApplicationListener());
        ConfigurableApplicationContext applicationContext = app.run(args);
        //发布事件 使用ApplicationContext接口继承的ApplicationEventPublisher接口发布事件
        applicationContext.publishEvent(new MyApplicationEvent(new Object()));
        applicationContext.close();
    }
    /*
    * 配置监听器
    * 1.SpringApplication.addListeners 添加监听器
    * 2.把监听器纳入spring容器管理
    * 3.在properties文件中使用context.listener.classes(内部细节在DelegatingApplicationListener体现)
    * 4.在方法上使用@EventListener，该类需要纳入spring容器管理(内部细节在EventListenerMethodProcessor体现)
    * */
}
