package cn.case9;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/23 15:19
 */
@Component
public class MyEventHandler {

    // 方法三  添加监听器到spring容器中(配置监听器)
    @EventListener
    //参数任意 所有事件及其子事件都可以接受到
    public void event(Object event) {
        System.out.println("MyEventHandler: \t\t" + event);
    }

    @EventListener
    public void event2(ContextClosedEvent event) {
        System.out.println("event2 = " + event);
    }
}
