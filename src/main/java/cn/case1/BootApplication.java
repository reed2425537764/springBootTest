package cn.case1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("cn.case1.mapper")
public class BootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class);
    }
}
