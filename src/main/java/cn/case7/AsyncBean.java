package cn.case7;

import org.springframework.scheduling.annotation.Async;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/16 11:04
 */
//@Component
public class AsyncBean {
    @Async
    public void async() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
