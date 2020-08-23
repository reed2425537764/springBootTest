package cn.case9;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/23 10:47
 */
//定义事件
public class MyApplicationEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyApplicationEvent(Object source) {
        super(source);
    }
}
