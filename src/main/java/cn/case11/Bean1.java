package cn.case11;

import org.springframework.stereotype.Component;

/**
 * @Author: shiyuqin
 * @Date: 2020/9/6 16:51
 */
@Component
public class Bean1 implements IBean1 {

    public void fun() {
        System.out.println("Bean1.fun");
    }
}
